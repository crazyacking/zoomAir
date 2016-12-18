package com.hut.crazyacking.controller;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.hut.crazyacking.service.SignUpService;
import com.hut.crazyacking.service.SignUpTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : crazyacking
 * @date : 2016/12/17
 */
@Controller
@RequestMapping("/page/")
public class PageController {

    @Autowired
    private SignUpService signUpService;

    @Autowired
    private SignUpTypeService signUpTypeService;

    /**
     * @author : crazyacking
     * @date : 2016-4-26
     *
     * 主页面
     *
     * @return
     */
    @RequestMapping("index")
    public String index(){
        return "index";
    }

    /**
     * @author : crazyacking
     * @date : 2016-04-26
     *
     * 新学生报名
     *
     * @return
     */
    @RequestMapping("newSignUp")
    public String newSignUp(Model model){
        model.addAttribute("signUpTypeList",signUpTypeService.getAllSignUpType());
        return "/student/newSignUp";
    }

    /**
     * @author : crazyacking
     * @date : 2016-4-26
     *
     * 学生列表
     *
     * @param pageNum
     * @param pageSize
     * @param stuName
     * @param model
     * @return
     */
    @RequestMapping("signUpList/{pageNum},{pageSize},{stuName}")
    public String signUpList(@PathVariable("pageNum")Integer pageNum,
                             @PathVariable("pageSize")Integer pageSize,
                             @PathVariable("stuName")String stuName,Model model){
        JSONObject paramJson = new JSONObject();
        paramJson.put("pageNum",pageNum);
        paramJson.put("pageSize",pageSize);
        paramJson.put("stuName",stuName);
        PageInfo pageInfo = signUpService.getAllSignUp(paramJson);

        modalAddAttributes(model, pageInfo);
        model.addAttribute("signUpList",pageInfo.getList());
        if(StringUtils.isEmpty(stuName)){
            stuName = "0";
        }
        model.addAttribute("stuName",stuName);

        return "/student/signUpList";
    }

    /**
     * @author : crazyacking
     * @date : 2016-4-26
     *
     * 返回说明页面
     *
     * @return
     */
    @RequestMapping("ananInfo")
    public String ananInfo(){
        return "ananInfo";
    }

    /**
     * @author : crazyacking
     * @date : 2016-3-11
     *
     * 返回页面的分页信息
     *
     * @param model
     * @param pageInfo
     */
    public void modalAddAttributes(Model model, PageInfo pageInfo) {
        model.addAttribute("endRow",pageInfo.getEndRow());
        model.addAttribute("firstPage",pageInfo.getFirstPage());
        model.addAttribute("hastNextPage",pageInfo.isHasNextPage());
        model.addAttribute("hasPrevioisPage",pageInfo.isHasPreviousPage());
        model.addAttribute("isFirstPage",pageInfo.isIsFirstPage());
        model.addAttribute("isLastPage",pageInfo.isIsLastPage());
        model.addAttribute("lastPage",pageInfo.getLastPage());
        model.addAttribute("navigatePages",pageInfo.getNavigatePages());
        model.addAttribute("navigatepageNums",pageInfo.getNavigatepageNums());

        model.addAttribute("nextPage",pageInfo.getNextPage());
        model.addAttribute("pageNum",pageInfo.getPageNum());
        model.addAttribute("pageSize",pageInfo.getPageSize());
        model.addAttribute("pages",pageInfo.getPages());
        model.addAttribute("prePage",pageInfo.getPrePage());
        model.addAttribute("size",pageInfo.getSize());
        model.addAttribute("startRow",pageInfo.getStartRow());
        model.addAttribute("total",pageInfo.getTotal());
    }
}
