package com.hello.util;

import java.sql.*;

/**
 * Created by Administrator on 2015/10/25.
 */
public class DBUtil {
    public static Connection conn = null;
    public static Connection getConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://119.29.159.210:3306/test","root","");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void freeConn(ResultSet rs,Statement stmt,Connection conn){
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null){
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(conn != null){
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Connection conn = getConn();
        try {
            String sql = "select * from t_user";;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            StringBuffer sb = new StringBuffer();
            while (rs != null && rs.next()){
                sb.append(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
            rs.close();
            stmt.close();
            conn.close();
            System.out.println(sb.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
