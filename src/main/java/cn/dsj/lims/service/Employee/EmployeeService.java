package cn.dsj.lims.service.Employee;

import cn.dsj.lims.pojo.Employee;

import java.util.Map;

public interface EmployeeService {
    /**
     * 查詢
     * @param empName
     * @param pageNo
     * @param pageSize
     * @return
     */
    public Map<String,Object> getEmployeeList(String empName, int pageNo, int pageSize);

    /**
     *添加
     * @param employee
     * @return
     */
    public boolean employeeAdd(Employee employee);

    /**
     *修改
     * @param employee
     * @return
     */
    public boolean employeeUpdate(Employee employee);

    /**
     *刪除
     * @param id
     * @return
     */
    public boolean employeeDelete(int id);




}
