package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.LibraryManagement;
import cn.dsj.lims.pojo.SysUser;
import cn.dsj.lims.service.Employee.EmployeeService;
import cn.dsj.lims.service.LibraryManagement.LibraryManagementService;
import cn.dsj.lims.util.DocConverter;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("/library")
public class LibraryManagementController {
    @Resource
    private LibraryManagementService libraryManagementService;
    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/list")
    public Map<String, Object> list(int page, int rows, String searchName, String searchType) {
        System.out.println("list...");
        if (searchName == null)
            searchName = "";
        return libraryManagementService.getLibraryManagementList(searchName, searchType, page, rows);
    }

    @PostMapping("/add")
    public String add(@RequestParam("file") MultipartFile multipartFile, String type, HttpSession session) {
        System.out.println("upload...");
        if (!multipartFile.isEmpty()) {//如果上传文件不是空
            //获取存储路径
            String path = session.getServletContext().getRealPath("static/upload/library");
            //获取文件名包含后缀
            String oldFileName = multipartFile.getOriginalFilename();
            //获取文件名不包含后缀
            String fileName = oldFileName.substring(0, oldFileName.lastIndexOf("."));
            //获取文件后缀名
            String suffixName = oldFileName.substring(oldFileName.lastIndexOf("."));
            //重新生成文件名
            String newFileName = UUID.randomUUID() + suffixName;
            //指定本地文件存储
            File file = new File(path);
            if (!file.exists()) {//如果文件不存在
                //创建文件夹
                file.mkdirs();
            }
            try {
                file = new File(path + File.separator + newFileName);
                file.createNewFile();
                System.out.println(file.getPath());
            } catch (IOException e) {
                return "false";
            }
            //保存
            try {
                multipartFile.transferTo(file);
            } catch (Exception e) {
                return "false";
            }
            //文件转换
            DocConverter dc = new DocConverter(file.getPath());
            //转换成功删除原文件
            if (dc.conver())
                file.delete();
            //pdf文档播放地址
            String swfpath = "static/upload/library" + dc.getswfPath().substring(dc.getswfPath().lastIndexOf("/"));
            //数据入库
            SysUser user = (SysUser) SecurityUtils.getSubject().getPrincipal();
            int staffId = employeeService.getOneByUserId(user.getId()).getStaffId();
            LibraryManagement libraryManagement = new LibraryManagement();
            libraryManagement.setEmployeeId(staffId);
            libraryManagement.setFileName(fileName);
            libraryManagement.setFilePath(swfpath);
            libraryManagement.setType(type);
            libraryManagement.setUploadingDate(new Date());
            if (libraryManagementService.add(libraryManagement))
                return "true";
            return "false";
        }
        return "false";
    }

    @RequestMapping("/modify")
    public String modify(LibraryManagement lib) {
        System.out.println("update...");
        if (libraryManagementService.update(lib))
            return "true";
        return "false";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "id", required = true) int id, HttpSession session) {
        System.out.println("delete...");
        //获取存储路径
        String filePath = libraryManagementService.selectOne(id).getFilePath();
        filePath = session.getServletContext().getRealPath(filePath);
        System.out.println("filePath:" + filePath);
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
            if (libraryManagementService.delete(id))
                return "true";
        }
        return "false";
    }

    @RequestMapping("/libDirs")
    public List<LibraryManagement> getLibDirs(int type) {
        String type1 = "";
        System.out.println("libDirs...");
        System.out.println(type);
        switch (type) {
            case 1:
                type1 = "技术文档";
                break;
            case 2:
                type1 = "质量文件";
                break;
            case 3:
                type1 = "检验标准";
                break;
        }
        return libraryManagementService.getLibDirs(type1);
    }
}
