package cn.dsj.lims.service.Equipment;

import cn.dsj.lims.pojo.Equipment;
import cn.dsj.lims.pojo.Maintain;
import cn.dsj.lims.pojo.Maintenance;
import cn.dsj.lims.pojo.Scrap;

import java.util.List;
import java.util.Map;

public interface EquipmentService {
    /**
     * 设备详情
     * @return
     */
    public List<Equipment> listEquipment();
    /**
     * 设备详情
     * @return
     */
    public Map<String,Object> findEquipmentAll(String equName , int pageNo, int pageSize);
    /**
     * 添加设备信息
     * @param equipment
     */
    public boolean addEquipment(Equipment equipment);

    /**修改设备信息
     *
     * @param equipment
     */
    public boolean updateEquipment(Equipment equipment);

    /**
     * 删除设备信息
     * @return
     */
    public boolean deleteEquipmentById(int id);

    /**
     * 设备维修
     * @return
     */
    public Map<String,Object> findMaintain(String equName , int pageNo, int pageSize);

    /**
     * 添加维修信息
     * @param maintain
     */
    public boolean addMaintain(Maintain maintain);

    /**
     * 修改维修信息
     * @param maintain
     */
    public boolean updateMaintain(Maintain maintain);

    /**
     * 删除维修信息
     * @param id
     */
    public boolean deleteMaintainById(Integer id);
    /**
     * 设备保养
     * @return
     */
    public Map<String,Object> findMaintenance(String equName , int pageNo, int pageSize);

    /**
     * 添加保养信息
     * @param maintenance
     */
    public boolean addMaintenance(Maintenance maintenance);

    /**修改保养信息
     *
     * @param maintenance
     */
    public boolean updateMaintenanceById(Maintenance maintenance);

    /**
     * 删除保养信息
     * @param id
     * @return
     */
    public boolean deleteMaintenanceById(Integer id);
    /**
     * 设备报废
     * @return
     */
    public Map<String,Object> findScrap(String equName , int pageNo, int pageSize);

    /**
     * 添加报废信息
     * @param scrap
     */
    public boolean addScrap( Scrap scrap);

    /**
     * 修改报废信息
     * @param scrap
     */
    public boolean updateScrap(Scrap scrap);

    /**
     * 删除报废信息
     * @param id
     */
    public boolean deleteScrap(Integer id);

}
