package cn.dsj.lims.service.LibraryManagement;

import cn.dsj.lims.pojo.LibraryManagement;

import java.util.List;
import java.util.Map;

public interface LibraryManagementService {
    /**
     * 全局查询
     *
     * @return
     */
    public Map<String, Object> getLibraryManagementList(String fileName, String type, int pageNo, int pageSize);

    /**
     * 增加技术文档
     *
     * @return
     */
    public boolean add(LibraryManagement libraryManagement);

    /**
     * 修改技术文档
     *
     * @return
     */
    public boolean update(LibraryManagement libraryManagement);

    /**
     * 删除技术文档
     *
     * @return
     */
    public boolean delete(int id);

    /**
     * 根据id查询文档
     *
     * @param id
     * @return
     */
    public LibraryManagement selectOne(int id);

    /**
     * 根据文档类型获取所有响应的文档
     *
     * @param type
     * @return
     */
    public List<LibraryManagement> getLibDirs(String type);

}
