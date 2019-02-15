package cn.dsj.lims.service.Employee;

import cn.dsj.lims.dao.EmployeeMapper;
import cn.dsj.lims.pojo.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Description：
 * EmployeeService实现类
 *
 * @author Administrator
 * @create 2019/1/18
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public Employee getOneByUserId(int userId) {
        return employeeMapper.getOneByUserId(userId);
    }
}