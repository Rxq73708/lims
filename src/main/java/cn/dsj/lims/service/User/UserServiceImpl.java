package cn.dsj.lims.service.User;

import cn.dsj.lims.dao.UserMapper;
import cn.dsj.lims.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description：
 * UserService实现类
 *
 * @author Administrator
 * @create 2019/1/2
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public Map<String, Object> select(String name, int pageNo, int pageSize) {
        Map<String, Object> map = new HashMap<>();
        int start = (pageNo - 1) * pageSize;
        int total = userMapper.count();
        map.put("rows", userMapper.select(name, start, pageSize));
        map.put("total", total);
        return map;
    }

    @Override
    public boolean add(User user) {
        if (userMapper.insert(user) > 0)
            return true;
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (userMapper.delete(id) > 0)
            return true;
        return false;
    }

    @Override
    public boolean modify(User user) {
        if (userMapper.update(user) > 0)
            return true;
        return false;
    }
}