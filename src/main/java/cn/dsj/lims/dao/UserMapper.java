package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    //查询所有
    public List<User> select(@Param("name")String name,@Param("start") int start,@Param("size") int size);

    //查询所有数据的总数
    public int count();

    //根据id删除
    public int delete(int id);

    //更新用户
    public int update(User user);

    //添加用户
    public int insert(User user);
}
