package com.hut.crazyacking.controller;

import com.alibaba.fastjson.JSONObject;
import com.hut.crazyacking.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : crazyacking
 * @date : 2016/12/17
 */
@Controller
@RequestMapping("/signUp/")
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    /**
     * @author : crazyacking
     * @date : 2016/12/17
     *
     * 新同学报名
     *
     * @param paramJson
     * @return
     */
    @RequestMapping(value = "addNewSignUp",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addNewSignUp(@RequestBody JSONObject paramJson){
        JSONObject resultJson = signUpService.addNewSignUp(paramJson);
        return resultJson;
    }
}
