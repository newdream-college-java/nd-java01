package com.dy.mapper;

import com.dy.entity.Fwxx;
import com.dy.entity.FwxxExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface FwxxMapper {
    long countByExample(FwxxExample example);

    int deleteByExample(FwxxExample example);

    int deleteByPrimaryKey(Integer fwid);

    int insert(Fwxx record);

    int insertSelective(Fwxx record);

    List<Fwxx> selectByExample(FwxxExample example);

    Fwxx selectByPrimaryKey(Integer fwid);

    int updateByExampleSelective(@Param("record") Fwxx record, @Param("example") FwxxExample example);

    int updateByExample(@Param("record") Fwxx record, @Param("example") FwxxExample example);

    int updateByPrimaryKeySelective(Fwxx record);

    int updateByPrimaryKey(Fwxx record);
    @Select("select CEIL(count(fwid)/3) from fwxx")
    int countBySelect();
}