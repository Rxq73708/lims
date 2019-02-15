package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.LibraryManagement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LibraryManagementMapper {
    /**
     * 全局查询
     *
     * @return
     */
    public List<LibraryManagement> getLibraryManagementList(@Param("fileName") String fileName, @Param("type") String type, @Param("start") int start, @Param("size") int size);

    /**
     * 增加技术文档
     *
     * @return
     */
    public int add(LibraryManagement libraryManagement);

    /**
     * 修改技术文档
     *
     * @return
     */
    public int update(LibraryManagement libraryManagement);

    /**
     * 删除技术文档ipconfig/
     *
     * @return
     */
    public int delete(int id);

    /**
     * 查询总记录数
     *
     * @return
     */
    public int count();

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
