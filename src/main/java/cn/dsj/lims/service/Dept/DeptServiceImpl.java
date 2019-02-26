package cn.dsj.lims.service.Dept;

import cn.dsj.lims.dao.DeptMapper;
import cn.dsj.lims.pojo.Dept;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService{
    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Dept> deptList() {
        return deptMapper.deptList();
    }
}
