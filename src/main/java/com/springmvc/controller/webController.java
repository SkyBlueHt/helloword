package com.springmvc.controller;

import com.springmvc.dao.StudentsMapper;
import com.springmvc.entity.Students;
import com.springmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class webController {
    @Autowired

    private StudentsMapper studentsMapper;

    @RequestMapping(value = "web/studentPost",method = RequestMethod.GET)
    public String tostudentPost(){
        return "studentPost";
    }
    @RequestMapping(value = "web/studentPost",method = RequestMethod.POST)
    public String doStudentPost(@ModelAttribute Students students, Model model){
        String result;
        if(studentsMapper.insert(students) == 1)
            result = "插入成功";
        else
            result = "插入失败";
        model.addAttribute("result",result);
        return "studentPost";
    }

    /*@RequestMapping(value = "web/studentPost",method = RequestMethod.POST)
    public String getAllStudent(@RequestParam("t1")int id, HttpServletRequest request, Model model){


        request.setAttribute("id",studentsMapper.selectByPrimaryKey(id));
        model.addAttribute("phoneno",studentsMapper.selectByPrimaryKey(id));
        return "studentPost";
    }*/

}
