package cn.dsj.lims.service.Checkitem;

import cn.dsj.lims.dao.CheckitemMapper;
import cn.dsj.lims.pojo.AssessCheckitem;
import cn.dsj.lims.pojo.AssessPartition;
import cn.dsj.lims.pojo.AssessSelfevaluation;
import cn.dsj.lims.pojo.AssessSupervisor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class CheckitemServiceImpl implements CheckitemService{
    @Resource
    private CheckitemMapper checkitemMapper;

    @Override
    public List<AssessCheckitem> checkitemList() {
        return checkitemMapper.checkitemList();
    }

    @Override
    public List<AssessPartition> partitionList() {
        return checkitemMapper.partitionList();
    }

    @Override
    public List<AssessSelfevaluation> selfevaluationList() {
        return checkitemMapper.selfevaluationList();
    }

    @Override
    public List<AssessSupervisor> supervisorList() {
        return checkitemMapper.supervisorList();
    }

    @Override
    public boolean addCheckitem(AssessCheckitem assessCheckitem) {
        if (checkitemMapper.addCheckitem(assessCheckitem)>0)
            return true;
        return false;
    }

    @Override
    public boolean addPartition(AssessPartition assessPartition) {
        if (checkitemMapper.addPartition(assessPartition)>0)
            return true;
        return false;
    }

    @Override
    public boolean addSelfevaluation(AssessSelfevaluation assessSelfevaluation) {
        if (checkitemMapper.addSelfevaluation(assessSelfevaluation)>0)
            return true;
        return false;
    }

    @Override
    public boolean addSupervisor(AssessSupervisor assessSupervisor) {
        if (checkitemMapper.addSupervisor(assessSupervisor)>0)
            return true;
        return false;
    }
    @Override
    public boolean updateCheckitem(AssessCheckitem assessCheckitem){
        if (checkitemMapper.updateCheckitem(assessCheckitem)>0)
            return true;
        return false;
    }
    @Override
    public boolean updatePartition(AssessPartition assessPartition){
        if (checkitemMapper.updatePartition(assessPartition)>0)
            return true;
        return false;
    }
    @Override
    public boolean updateSelfevaluation(AssessSelfevaluation assessSelfevaluation){
        if (checkitemMapper.updateSelfevaluation(assessSelfevaluation)>0)
            return true;
        return false;
    }
    @Override
    public boolean updateSupervisor(AssessSupervisor assessSupervisor){
        if (checkitemMapper.updateSupervisor(assessSupervisor)>0)
            return true;
        return false;
    }
    @Override
    public boolean deleteCheckitem(int id){
        if (checkitemMapper.deleteCheckitem(id)>0)
            return true;
        return false;
    }
    @Override
    public boolean deletePartition(int id){
        if (checkitemMapper.deletePartition(id)>0)
            return true;
        return false;
    }
    @Override
    public boolean deleteSelfevaluation(int id){
        if (checkitemMapper.deleteSelfevaluation(id)>0)
            return true;
        return false;
    }
    @Override
    public boolean deleteSupervisor(int id){
        if (checkitemMapper.deleteSupervisor(id)>0)
            return true;
        return false;
    }

}
