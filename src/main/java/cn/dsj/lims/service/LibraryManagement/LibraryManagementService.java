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
    public Map<String,Object> getLibraryManagementList(String fileName, int type, int pageNo, int pageSize);

    /**
     * 查询文档的所有类型
     *
     * @return
     */
    public List<LibraryManagement> getLibraryMangementByType();

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
}
