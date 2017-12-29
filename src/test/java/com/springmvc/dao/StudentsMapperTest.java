package com.springmvc.dao;

import com.springmvc.entity.Students;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

import static java.lang.System.out;
import static org.junit.Assert.*;

public class StudentsMapperTest {
    private ApplicationContext applicationContext;
    @Autowired
    private StudentsMapper studentsMapper ;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");//加载spring配置文件
        studentsMapper = applicationContext.getBean(StudentsMapper.class);//在这里导入要测试的
    }
    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void insert() throws Exception {
        Students students = new Students();
        students.setId(37);
        students.setAddress("123123");
        students.setName("神木村");
        students.setPhoneno(1334567898);
        students.setSex(1);
        students.setPwd("8888888");
        students.setScoresId(1);
        int result = studentsMapper.insertSelective(students);
        System.out.println(result);
        assert (result ==1);

    }
    @Test
    public void getCount()throws Exception{
        System.out.println(studentsMapper.getCount());
    }

    @Test
    public void selectStudent()throws Exception{
        Students students = new Students();
        students.setId(38);
        ArrayList<Students> list = studentsMapper.selectSelective(students);
        for (Students s:list){
            System.out.println(s);
        }
    }

}