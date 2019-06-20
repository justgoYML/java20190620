package com.qf.j1902.dao.impl;

import com.qf.j1902.bean.BmiBean;
import com.qf.j1902.dao.BmiDao;
import com.qf.j1902.utils.BaseDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeffrey on 2019/5/14.
 */
public class BmiDaoImpl extends BaseDao implements BmiDao{

    public List<BmiBean> findAll() {
        List<BmiBean> list = new ArrayList<>();
        try {
            super.getConnection();
            String sql ="select * from bmi";
            pstmt = super.conn.prepareStatement(sql);
            rs  = pstmt.executeQuery();

            while(rs.next()){
                BmiBean bmi = new BmiBean();
                bmi.setBmi(rs.getString("bmi"));
                bmi.setId(rs.getInt("ID"));
                bmi.setBmidate(rs.getString("date"));
                bmi.setHeight(rs.getString("height"));
                bmi.setSign(rs.getString("sign"));
                bmi.setWeight(rs.getString("weight"));
                bmi.setUsername(rs.getString("username"));
               list.add(bmi);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            super.closeAll();
        }
        return null;
    }
}
