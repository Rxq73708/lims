package cn.dsj.lims.service.Employee;

import cn.dsj.lims.dao.EmployeeMapper;
import cn.dsj.lims.pojo.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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
    public List<Employee> getEmployeeList() {
        return employeeMapper.getEmployeeList();
    }

    @Override
    public List<Employee> list() {
        return employeeMapper.list();
    }

    @Override
    public Employee getOneByUserId(int userId) {
        return employeeMapper.getOneByUserId(userId);
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if(employeeMapper.addEmployee(employee)>0)
            return true;
        return false;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        if(employeeMapper.updateEmployee(employee)>0)
            return true;
        return false;
    }

    @Override
    public boolean deleteEmployee(int id) {
        if (employeeMapper.deleteEmployee(id)>0)
            return true;
        return false;
    }

    @Override
    public Employee getOneByStaffId(int staffId) {
        return employeeMapper.getOneByStaffId(staffId);
    }
}