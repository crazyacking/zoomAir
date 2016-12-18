package com.hut.crazyacking.service.impl;

import com.hut.crazyacking.service.EmpService;
import com.hut.crazyacking.util.DBUtil;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 * Created by crazyacking on 2016/12/17.
 */
@Service
public class EmpServiceImpl implements EmpService {

    public HashMap findOneEmp(String empNo) {
        Connection conn = DBUtil.getConn();
        Statement stmt = null;
        StringBuffer sb = new StringBuffer();
        HashMap hashMap = new HashMap();
        String sql = "select * from emp where empno = "+ empNo;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs!= null && rs.next()){
                sb.append("EmpNO:"+rs.getString("empno")+"\t");
                sb.append("eName:"+rs.getString("ename")+"\n\r");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.freeConn(rs,stmt,conn);
        }
        hashMap.put("empInfo",sb.toString());
        return hashMap;
    }
}
