package cn.dsj.lims.service.Equipment;
import cn.dsj.lims.dao.EquipmentMapper;
import cn.dsj.lims.pojo.Equipment;
import cn.dsj.lims.pojo.Maintain;
import cn.dsj.lims.pojo.Maintenance;
import cn.dsj.lims.pojo.Scrap;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class EquipmentServiceImpl implements EquipmentService {
    @Resource
    private EquipmentMapper equipmentMapper;
    @Override
    public Map<String,Object> findEquipmentAll(String equName , int pageNo, int pageSize) {
        Map<String,Object> map=new HashMap<>();
        int start=(pageNo-1)*pageSize;
        map.put("total",equipmentMapper.count());
        map.put("rows",equipmentMapper.findEquipmentAll( equName,  start, pageSize));
        return map;
    }
    /**
     * 添加设备信息
     * @param equipment
     */
    @Override
    public boolean addEquipment(Equipment equipment) {
        if(equipmentMapper.addEquipment(equipment)>0)
            return true;
        return false;
    }
    /**
     * 修改设备信息
     * @param equipment
     */
    @Override
    public boolean updateEquipment(Equipment equipment) {
        if(equipmentMapper.updateEquipment(equipment)>0)
            return true;
        return false;
    }
    /**
     * 删除设备信息
     * @return
     */
    @Override
    public boolean deleteEquipmentById(int id) {
        if (equipmentMapper.deleteEquipmentById(id)>0)
            return true;
        return false;
    }
    /**
     * 查询维修信息
     * @return
     */
    @Override
    public Map<String,Object> findMaintain(String equName , int pageNo, int pageSize) {
        Map<String,Object> map=new HashMap<>();
        int start=(pageNo-1)*pageSize;
        map.put("total",equipmentMapper.countMaintain());
        map.put("rows",equipmentMapper.findMaintain( equName,  start, pageSize));
        return map;
    }
    /**
     * 添加维修信息
     * @param maintain
     */
    @Override
    public boolean addMaintain(Maintain maintain) {
        if(equipmentMapper.addMaintain(maintain)>0)
            return true;
        return false;
    }
    /**
     * 修改维修信息
     * @param maintain
     */
    @Override
    public boolean updateMaintain(Maintain maintain) {
        if(equipmentMapper.updateMaintain(maintain)>0)
            return true;
        return false;
    }
    /**
     * 删除维修信息
     * @param id
     */
    @Override
    public boolean deleteMaintainById(Integer id) {
        if (equipmentMapper.deleteMaintainById(id)>0)
            return true;
        return false;
    }
    /**
     * 查询保养信息
     * @return
     */
    @Override
    public Map<String,Object> findMaintenance(String equName , int pageNo, int pageSize) {
        Map<String,Object> map=new HashMap<>();
        int start=(pageNo-1)*pageSize;
        map.put("total",equipmentMapper.countMaintenance());
        map.put("rows",equipmentMapper.findMaintenance( equName,  start, pageSize));
        return map;
    }
    /**
     * 添加保养信息
     * @param maintenance
     */
    @Override
    public boolean addMaintenance(Maintenance maintenance) {
        if(equipmentMapper.addMaintenance(maintenance)>0)
            return true;
        return false;
    }

    /**
     * 修改保养信息
     *
     * @param maintenance
     */
    @Override
    public boolean updateMaintenanceById(Maintenance maintenance) {
        if(equipmentMapper.updateMaintenanceById(maintenance)>0)
            return true;
        return false;
    }

    /**
     * 删除保养信息
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteMaintenanceById(Integer id) {
        if (equipmentMapper.deleteMaintenanceById(id)>0)
            return true;
        return false;
    }

    /**
     * 查询报废信息
     * @return
     */
    @Override
    public Map<String,Object> findScrap(String equName , int pageNo, int pageSize) {
        Map<String,Object> map=new HashMap<>();
        int start=(pageNo-1)*pageSize;
        map.put("total",equipmentMapper.countScrap());
        map.put("rows",equipmentMapper.findScrap( equName,  start, pageSize));
        return map;
    }

    /**
     * 添加报废信息
     * @param scrap
     */
    @Override
    public boolean addScrap(Scrap scrap) {
        if(equipmentMapper.addScrap(scrap)>0)
            return true;
        return false;
    }

    /**
     * 修改报废信息
     *
     * @param scrap
     */
    @Override
    public boolean updateScrap(Scrap scrap) {
        if(equipmentMapper.updateScrap(scrap)>0)
            return true;
        return false;
    }

    /**
     * 删除报废信息
     *
     * @param id
     */
    @Override
    public boolean deleteScrap(Integer id) {
        if (equipmentMapper.deleteScrap(id)>0)
            return true;
        return false;
    }

}
