package cn.dsj.lims.dao;

import java.util.List;
import cn.dsj.lims.pojo.Equipment;
import cn.dsj.lims.pojo.Maintain;
import cn.dsj.lims.pojo.Maintenance;
import cn.dsj.lims.pojo.Scrap;

import org.apache.ibatis.annotations.Param;


public interface EquipmentMapper {
    /**
     * 设备详情信息
     * @return
     */
    public List<Equipment> findEquipmentAll(@Param("equName")String equName , @Param("start") int start, @Param("size") int size);
    /**
     * 添加设备信息
     * @param equipment
     */
    public int addEquipment(Equipment equipment);
    /**
     * 修改设备信息
     * @param equipment
     */
    public int updateEquipment(Equipment equipment);
    /**
     * 删除设备信息
     * @param id
     * @return
     */
    public int deleteEquipmentById(int id);
    /**
     * 查询设备总记录数
     * @return
     */
    public int count();

    /**
     * 设备维修信息
     * @return
     */
    public List<Maintain> findMaintain(@Param("equName")String equName , @Param("start") int start, @Param("size") int size);
    /**
     * 添加维修信息
     * @param maintain
     */
    public int addMaintain(Maintain maintain);
    /**
     * 修改维修信息
     * @param maintain
     */
    public int updateMaintain(Maintain maintain);
    /**
     * 删除维修信息
     * @param id
     * @return
     */
    public int deleteMaintainById(Integer id);
    /**
     * 查询维修总记录数
     * @return
     */
    public int countMaintain();
    /**
     * 查询保养信息
     * @return
     */
    public List<Maintenance> findMaintenance(@Param("equName")String equName , @Param("start") int start, @Param("size") int size);
    /**
     * 添加保养信息
     * @param maintenance
     */
    public int addMaintenance(Maintenance maintenance);
    /**
     * 修改保养休息
     * @param maintenance
     */
    public int updateMaintenanceById(Maintenance maintenance);
    /**
     * 删除保养信息
     * @param id
     * @return
     */
    public int deleteMaintenanceById(Integer id);
    /**
     * 查询保养总记录数
     * @return
     */
    public int countMaintenance();
    /**
     * 查询报废信息
     * @return
     */
    public List<Scrap> findScrap(@Param("equName")String equName , @Param("start") int start, @Param("size") int size);
    /**
     * 添加报废信息
     * @param scrap
     *
     */
    public int addScrap(Scrap scrap);
    /**
     * 修改报废信息
     * @param scrap
     */
    public int updateScrap(Scrap scrap);
    /**
     * 删除报废信息
     * @param id
     * @return
     */
    public int deleteScrap(Integer id);

    /**
     * 查询报废总记录数
     * @return
     */
    public int countScrap();

}