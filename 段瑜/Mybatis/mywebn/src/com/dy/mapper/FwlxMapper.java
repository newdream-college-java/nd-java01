package com.dy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dy.entity.Fwlx;
import com.dy.entity.FwlxExample;

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