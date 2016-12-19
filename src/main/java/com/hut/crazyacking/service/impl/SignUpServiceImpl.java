package com.hut.crazyacking.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hut.crazyacking.Constant;
import com.hut.crazyacking.mapper.SignUpMapper;
import com.hut.crazyacking.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author : crazyacking
 * @date : 2016/12/17
 */
@Service
public class SignUpServiceImpl extends BaseServiceImpl implements SignUpService {
    @Autowired
    private SignUpMapper signUpMapper;

    @Override
    public JSONObject addNewSignUp(JSONObject paramJson) {
        JSONObject resultJson = getResultJson();
        if(StringUtils.isEmpty(paramJson.getString("qq"))){
            paramJson.put("qq","xxx");
        }
        if(StringUtils.isEmpty(paramJson.getString("weiChart"))){
            paramJson.put("weiChart","xxx");
        }
        if(StringUtils.isEmpty(paramJson.getString("address"))){
            paramJson.put("address","xxx");
        }

        Integer num = signUpMapper.addNewSignUp(paramJson);
        if(num < 1){
            resultJson.put("success",false);
        }
        return resultJson;
    }

    @Override
    public PageInfo getAllSignUp(JSONObject paramJson) {
        //分页内容
        Integer pageNum = paramJson.getInteger("pageNum");
        Integer pageSize = paramJson.getInteger("pageSize");
        String stuName = paramJson.getString("stuName");

        if(pageNum == null || pageNum == 0) {
            pageNum = Constant.PAGENUM;
            paramJson.put("pageNum", pageNum);
        }
        if(pageSize == null || pageSize == 0) {
            pageSize = Constant.PAGESIZE;
            paramJson.put("pageSize",pageSize);
        }
        if(StringUtils.isEmpty(stuName) || "0".equals(stuName)) paramJson.put("stuName",null);

        PageHelper.startPage(pageNum,pageSize);
        List<HashMap> signUpList =  signUpMapper.getAllSignUp(paramJson);
        PageInfo pageInfo = new PageInfo(signUpList);

        return pageInfo;
    }
}
