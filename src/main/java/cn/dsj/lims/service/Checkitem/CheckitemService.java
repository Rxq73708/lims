package cn.dsj.lims.service.Checkitem;

import cn.dsj.lims.pojo.AssessCheckitem;
import cn.dsj.lims.pojo.AssessPartition;
import cn.dsj.lims.pojo.AssessSelfevaluation;
import cn.dsj.lims.pojo.AssessSupervisor;
import org.hibernate.validator.constraints.URL;

import java.util.List;


public interface CheckitemService {
    public List<AssessCheckitem> checkitemList();

    public List<AssessPartition> partitionList();

    public List<AssessSelfevaluation> selfevaluationList();

    public List<AssessSupervisor> supervisorList();

    public boolean addCheckitem(AssessCheckitem assessCheckitem);

    public boolean addPartition(AssessPartition assessPartition);

    public boolean addSelfevaluation(AssessSelfevaluation assessSelfevaluation);

    public boolean addSupervisor(AssessSupervisor assessSupervisor);

    public boolean updateCheckitem(AssessCheckitem assessCheckitem);

    public boolean updatePartition(AssessPartition assessPartition);

    public boolean updateSelfevaluation(AssessSelfevaluation assessSelfevaluation);

    public boolean updateSupervisor(AssessSupervisor assessSupervisor);

    public boolean deleteCheckitem(int id);

    public boolean deletePartition(int id);

    public boolean deleteSelfevaluation(int id);

    public boolean deleteSupervisor(int id);
}
