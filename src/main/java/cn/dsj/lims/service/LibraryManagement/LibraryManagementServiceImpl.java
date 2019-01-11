package cn.dsj.lims.service.LibraryManagement;

import cn.dsj.lims.dao.LibraryManagementMapper;
import cn.dsj.lims.pojo.LibraryManagement;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LibraryManagementService实现类
 */
@Transactional
@Service
public class LibraryManagementServiceImpl implements LibraryManagementService{
    @Resource
    private LibraryManagementMapper libraryManagementMapper;
    @Override
    public Map<String,Object> getLibraryManagementList(String fileName, int type, int pageNo, int pageSize) {
        Map<String,Object> map=new HashMap<>();
        int start=(pageNo-1)*pageSize;
        map.put("total",libraryManagementMapper.count());
        map.put("rows",libraryManagementMapper.getLibraryManagementList( fileName, type, start, pageSize));
        return map;
    }

    @Override
    public List<LibraryManagement> getLibraryMangementByType() {
        return libraryManagementMapper.getLibraryMangementByType();
    }

    @Override
    public boolean add(LibraryManagement libraryManagement) {
        if(libraryManagementMapper.add(libraryManagement)>0)
            return true;
        return false;
    }

    @Override
    public boolean update(LibraryManagement libraryManagement) {
        if(libraryManagementMapper.update(libraryManagement)>0)
            return true;
        return false;
    }

    @Override
    public boolean delete(int id) {
        if(libraryManagementMapper.delete(id)>0)
            return true;
        return false;
    }


}
