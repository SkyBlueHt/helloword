package com.springmvc.controller;

import com.springmvc.entity.Students;
import com.springmvc.service.StudentService;
import com.springmvc.util.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class studentUser {

    @Autowired
    private StudentService studentService;

    //返回到注册页面
    @RequestMapping(value = "web/zc",method = RequestMethod.GET)
    public String tozcweb(){
        return "zcsignup";
    }

    //注册功能实现
    @RequestMapping(value = "web/zc",method = RequestMethod.POST)
    public String inserStudent(@ModelAttribute Students students, Model model){
        Students record = new Students();

        record.setSex(students.getSex());
        record.setPwd(students.getPwd());
        record.setName(students.getName());
        List<Students> list = studentService.selectSelective(record);
        if (list.size() == 0){

            students.setPwd(students.getPwd());//md5加密
            if (studentService.insert(students)==1)
                model.addAttribute("result",1); //注册成功
            else
                model.addAttribute("result",0); //发生错误
        }
        else {
            model.addAttribute("result",2);//该id已经有人注册
        }
        return "zcsignup";
    }

    //返回登陆页面
    @RequestMapping(value = "web/studentLogin",method = RequestMethod.GET)
    public String tologin(){
        return "login";
    }
    //登陆功能实现
    @RequestMapping(value = "web/studentLogin", method = RequestMethod.POST)
    public String doLogin(HttpSession session, Model model, @ModelAttribute Students students) {
        List<Students> list = new ArrayList<Students>();
        Students record = new Students();
        record.setName(students.getName());
        list = studentService.selectSelective(record);
        if (list.size() == 0)
            model.addAttribute("result", "0");   //该账户不存在！
        else {
            record.setPwd(students.getPwd());
            list = studentService.selectSelective(record);
            if (list.size() == 0)
                model.addAttribute("result", "1");   //密码错误！
            else {
                record = list.get(0);
                session.setAttribute("user", record);
                //将用户信息保存在session里面
                model.addAttribute("result", "2");   //登陆成功！
            }
        }
        return "login";
    }
    //登陆后学生信息显示
    @RequestMapping(value = "/web/studentInfo", method = RequestMethod.GET)
    public String toInfo(Model model, HttpSession session) {
        Students stu = (Students) session.getAttribute("user");
        if (stu != null)
            model.addAttribute("stu", stu);
        return "studentInfo";
    }
    //退出登录，注销账户
    @RequestMapping(value = "/web/login", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.invalidate();
//        session.removeAttribute("user");
        return "login";
    }


}
