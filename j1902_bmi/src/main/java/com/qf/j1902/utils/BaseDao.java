package com.qf.j1902.utils;

import java.sql.*;

/**
 * 公共数据访问类
 * Created by jeffrey on 2019/5/14.
 */
public class BaseDao {
//    常量部分
    final static String  DRIVER=Env.newInstance().getProperty("jdbc.driver");
    final static String  URL=Env.newInstance().getProperty("jdbc.url");
    final static String  USERNAME=Env.newInstance().getProperty("jdbc.username");
    final static String  PASSWORD=Env.newInstance().getProperty("jdbc.password");
//    成员变量
  protected  Connection conn;
    protected  PreparedStatement pstmt;
    protected  ResultSet rs;

//使用静态块加载驱动
    static{
    try {
        Class.forName(DRIVER);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}

public  void getConnection(){
    try {
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public void closeAll(){
     try {
         if(rs!=null) rs.close();
         if(pstmt!=null) pstmt.close();
         if(conn!=null) conn.close();

     } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
