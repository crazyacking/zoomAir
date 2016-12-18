package com.hut.crazyacking.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;

/**
 * @author : crazyacking
 * @date : 2016/12/18
 */
public interface SignUpService {
    /**
     * 用户注册
     *
     * @param paramJson 用户信息
     * @return 注册结果
     */
    JSONObject addNewSignUp(JSONObject paramJson);

    /**
     * 获取已注册用户信息
     *
     * @param paramJson 分页描述
     * @return 已注册用户信息页面
     */
    PageInfo getAllSignUp(JSONObject paramJson);
}
