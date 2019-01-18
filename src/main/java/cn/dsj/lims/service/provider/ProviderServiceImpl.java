package cn.dsj.lims.service.provider;

import cn.dsj.lims.dao.ProviderMapper;
import cn.dsj.lims.pojo.Provider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description：
 * 供应商接口实现类
 *
 * @author Administrator
 * @create 2019/1/15
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Resource
    private ProviderMapper providerMapper;
    @Override
    public List<Provider> getProviderList() {
        return providerMapper.getProviderList();
    }
}