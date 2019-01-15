package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.LibraryManagement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LibraryManagementMapper {
    /**
     * 全局查询
     * @return
     */
    public List<LibraryManagement> getLibraryManagementList(@Param("fileName")String fileName ,@Param("type") String type, @Param("start") int start, @Param("size") int size);
    /**
     * 增加技术文档
     * @return
     */
    public int add(LibraryManagement libraryManagement);

    /**
     * 修改技术文档
     * @return
     */
    public int update(LibraryManagement libraryManagement);

    /**
     * 删除技术文档ipconfig/
     * @return
     */
    public  int delete(int id);
    /**
     * 查询所有类型
     * @return
     */
    public List<LibraryManagement> getLibraryMangementByType();

    /**
     * 查询总记录数
     * @return
     */
    public int count();
}
