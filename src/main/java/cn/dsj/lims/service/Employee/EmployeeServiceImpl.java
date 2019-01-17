package cn.dsj.lims.service.Employee;

import cn.dsj.lims.dao.EmployeeMapper;
import cn.dsj.lims.pojo.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * EmployeeServiceImpl实现类
 */

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public Map<String, Object> getEmployeeList(String empName, int pageNo, int pageSize) {
        Map<String, Object> map = new HashMap<>();
        int start = (pageNo - 1) * pageSize;
        map.put("total", employeeMapper.count());
        map.put("rows", employeeMapper.getEmployeeList(empName, start, pageSize));
        return map;
    }

    @Override
    public boolean employeeAdd(Employee employee) {
   employeeMapper.employeeAdd(employee) ;
            return true;
    }

    @Override
    public boolean employeeUpdate(Employee employee) {
        if (employeeMapper.employeeUpdate(employee) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean employeeDelete(int id) {
        if (employeeMapper.employeeDelete(id) > 0) {
            return true;
        }
        return false;
    }
}
