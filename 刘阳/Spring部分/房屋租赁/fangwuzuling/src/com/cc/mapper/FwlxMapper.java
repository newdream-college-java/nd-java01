package com.cc.mapper;

import com.cc.entity.Fwlx;
import com.cc.entity.FwlxExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FwlxMapper {
    long countByExample(FwlxExample example);

    int deleteByExample(FwlxExample example);

    int deleteByPrimaryKey(Integer lxid);

    int insert(Fwlx record);

    int insertSelective(Fwlx record);

    List<Fwlx> selectByExample(FwlxExample example);

    Fwlx selectByPrimaryKey(Integer lxid);

    int updateByExampleSelective(@Param("record") Fwlx record, @Param("example") FwlxExample example);

    int updateByExample(@Param("record") Fwlx record, @Param("example") FwlxExample example);

    int updateByPrimaryKeySelective(Fwlx record);

    int updateByPrimaryKey(Fwlx record);
}