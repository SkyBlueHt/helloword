package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class mainController {
    @RequestMapping("test/href1")
    public String test1(){
        return "test1";
    }
    @RequestMapping("test/href2")
    public String test2(Model mode1){
        Random random = new Random();
        mode1.addAttribute("data",random.nextInt(100));
        return "test2";
    }
    @RequestMapping("test/href3/data={zhi}")
    public  String test3(@PathVariable("zhi")String data, Model modle){
        modle.addAttribute("data",data);
        return "test3";
    }
    @RequestMapping(value = "test/href4",method = RequestMethod.GET)
    public String test4(@RequestParam("t1")int begin,
                        @RequestParam("t2")int end,Model model){
        Random random = new Random();
        model.addAttribute("data",begin+random.nextInt(end-begin));
        model.addAttribute("begin",begin);
        model.addAttribute("end",end);
        model.addAttribute("fangfa","GET");
        return "test4";
    }
    @RequestMapping(value = "test/href5",method = RequestMethod.POST)
    public String test5(@RequestParam("t1")int begin,
                        @RequestParam("t2")int end,Model model){
        Random random = new Random();
        model.addAttribute("data",begin+random.nextInt(end-begin));
        model.addAttribute("begin",begin);
        model.addAttribute("end",end);
        model.addAttribute("fangfa","post");
        return "test4";
    }
}
