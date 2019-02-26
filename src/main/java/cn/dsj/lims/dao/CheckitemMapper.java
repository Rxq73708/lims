package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.AssessCheckitem;
import cn.dsj.lims.pojo.AssessPartition;
import cn.dsj.lims.pojo.AssessSelfevaluation;
import cn.dsj.lims.pojo.AssessSupervisor;

import java.util.List;

public interface CheckitemMapper {

    public List<AssessCheckitem> checkitemList();

    public List<AssessPartition> partitionList();

    public List<AssessSelfevaluation> selfevaluationList();

    public List<AssessSupervisor> supervisorList();


    public int addCheckitem(AssessCheckitem assessCheckitem);

    public int addPartition(AssessPartition assessPartition);

    public int addSelfevaluation(AssessSelfevaluation assessSelfevaluation);

    public int addSupervisor(AssessSupervisor assessSupervisor);

    public int updateCheckitem(AssessCheckitem assessCheckitem);

    public int updatePartition(AssessPartition assessPartition);

    public int updateSelfevaluation(AssessSelfevaluation assessSelfevaluation);

    public int  updateSupervisor(AssessSupervisor assessSupervisor);

    public int deleteCheckitem(int id);

    public int deletePartition(int id);

    public int deleteSelfevaluation(int id);

    public int deleteSupervisor(int id);
}
