package com.hello.mapper;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.List;

/**
 * Created by hsjc on 2015/10/26.
 */
public interface SignUpMapper {
    Integer addNewSignUp(JSONObject paramJson);

    List<HashMap> getAllSignUp(JSONObject paramJson);
}
