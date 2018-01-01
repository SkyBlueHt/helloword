package com.springmvc.service;

import com.springmvc.dao.StudentsMapper;
import com.springmvc.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    @Autowired
    private StudentsMapper studentsMapper;

    public int insert(Students students){
        return  studentsMapper.insertSelective(students);
    }

    int deleteByPrimaryKey(Integer id){
        return studentsMapper.deleteByPrimaryKey(id);
    }
    Students selectByPrimaryKey(Integer id) {
        return studentsMapper.selectByPrimaryKey(id);
    }

    int updateByPrimaryKeySelective(Students record) {
        return studentsMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(Students record) {
        return studentsMapper.updateByPrimaryKey(record);
    }

    int getCount() {
        return studentsMapper.getCount();
    }

    /*ArrayList<Students> selectSelective(Students record) {
        return studentsMapper.selectStudent(record);
    }*/

     public ArrayList<Students> selectSelective(Students record) {
        return studentsMapper.selectSelective(record);
    }

}
