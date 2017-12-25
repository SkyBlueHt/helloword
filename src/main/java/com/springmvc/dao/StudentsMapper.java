package com.springmvc.dao;

import com.springmvc.entity.Students;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}