package com.hut.crazyacking.controller;

import com.alibaba.fastjson.JSONObject;
import com.hut.crazyacking.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by crazyacking on 2016/12/17.
 */
@Controller
public class HelloController {

    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String hello(Model model,@PathVariable("name")String name){
        model.addAttribute("name",name);
        return "hello";
    }

    @RequestMapping(value = "/empInfo",method = RequestMethod.GET)
    public String empInfo(Model model){
        HashMap hashMap = empService.findOneEmp("100002");
        model.addAttribute("empInfo",hashMap.get("empInfo"));
        return "empInfo";
    }

    @RequestMapping("/tt")
    @ResponseBody
    public JSONObject tt(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message","Test Success!");
        jsonObject.put("success",true);
        return jsonObject;
    }
}
