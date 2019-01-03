package cn.dsj.lims.service.User;

import cn.dsj.lims.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public Map<String,Object> select(String name, int pageNo, int pageSize);

    public boolean add(User user);

    public boolean delete(int id);

    public boolean modify(User user);
}
