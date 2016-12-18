package com.hut.crazyacking.service;

import java.util.HashMap;

/**
 * Created by crazyacking on 2016/12/17.
 */
public interface EmpService {
    /**
     * 根据用户编号查找用户信息
     *
     * @param empNo 用户编号
     * @return 用户信息集合
     */
    HashMap findOneEmp(String empNo);
}
