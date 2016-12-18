package com.hello.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;

/**
 * @author : zhuzi
 * @date : 2016/12/18
 */
public interface SignUpService{
    JSONObject addNewSignUp(JSONObject paramJson);

    PageInfo getAllSignUp(JSONObject paramJson);
}
