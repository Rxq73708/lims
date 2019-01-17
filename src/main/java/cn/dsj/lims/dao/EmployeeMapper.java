package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    /**
     * 查詢
     * @param empName
     * @param start
     * @param size
     * @return
     */
    public List<Employee> getEmployeeList(@Param("empName") String empName,@Param("start") int start, @Param("size") int size);

    /**
     *添加
     * @param employee
     * @return
     */
    public int employeeAdd(Employee employee);

    /**
     *修改
     * @param employee
     * @return
     */
    public int employeeUpdate(Employee employee);

    /**
     *刪除
     * @param id
     * @return
     */
    public int employeeDelete(int id);
    /**
     * 查询总记录数
     * @return
     */
    public int count();




}
