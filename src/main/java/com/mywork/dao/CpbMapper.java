package com.mywork.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.mywork.domain.Cpb;
import com.mywork.domain.CpbExample;

public interface CpbMapper {
    long countByExample(CpbExample example);

    int deleteByExample(CpbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cpb record);

    int insertSelective(Cpb record);

    List<Cpb> selectByExample(CpbExample example);

    Cpb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cpb record, @Param("example") CpbExample example);

    int updateByExample(@Param("record") Cpb record, @Param("example") CpbExample example);

    int updateByPrimaryKeySelective(Cpb record);

    int updateByPrimaryKey(Cpb record);
}