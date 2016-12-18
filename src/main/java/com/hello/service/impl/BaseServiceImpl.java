package com.hello.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @author : zhuzi
 * @date : 2016/4/26
 */
@Service
public class BaseServiceImpl {
    public JSONObject getResultJson() {
        JSONObject resultJson = new JSONObject();
        resultJson.put("success",true);
        return resultJson;
    }
}
