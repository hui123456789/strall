package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.bl;

public interface blMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(bl record);

    int insertSelective(bl record);

    bl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(bl record);

    int updateByPrimaryKey(bl record);
    
    @Select("select *from bill")
    List<bl> list();
}