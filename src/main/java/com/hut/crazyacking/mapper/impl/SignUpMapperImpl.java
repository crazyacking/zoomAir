package com.hut.crazyacking.mapper.impl;

import com.alibaba.fastjson.JSONObject;
import com.hut.crazyacking.mapper.SignUpMapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * Created by crazyacking on 2016/12/18.
 */
@Component("signUpMapper")
public class SignUpMapperImpl implements SignUpMapper {
    @Override
    public Integer addNewSignUp(JSONObject paramJson) {
        return null;
    }

    @Override
    public List<HashMap> getAllSignUp(JSONObject paramJson) {
        return null;
    }
}
