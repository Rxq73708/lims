package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.Sample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SampleMapper {
    List<Sample> getSampleList(@Param("level") int levle,@Param("parentId") int parentId );
}
