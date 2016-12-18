package com.hut.crazyacking.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @author : crazyacking
 * @date : 2016/12/17
 */
@Service
public class BaseServiceImpl {
    public JSONObject getResultJson() {
        JSONObject resultJson = new JSONObject();
        resultJson.put("success",true);
        return resultJson;
    }
}
