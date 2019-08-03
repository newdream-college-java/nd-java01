package com.cc.mapper;

import com.cc.entity.Fwqx;
import com.cc.entity.FwqxExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FwqxMapper {
    long countByExample(FwqxExample example);

    int deleteByExample(FwqxExample example);

    int deleteByPrimaryKey(Integer qxid);

    int insert(Fwqx record);

    int insertSelective(Fwqx record);

    List<Fwqx> selectByExample(FwqxExample example);

    Fwqx selectByPrimaryKey(Integer qxid);

    int updateByExampleSelective(@Param("record") Fwqx record, @Param("example") FwqxExample example);

    int updateByExample(@Param("record") Fwqx record, @Param("example") FwqxExample example);

    int updateByPrimaryKeySelective(Fwqx record);

    int updateByPrimaryKey(Fwqx record);
}