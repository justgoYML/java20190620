package com.qf.j1902.dao;

import com.qf.j1902.bean.BmiBean;
import com.qf.j1902.dao.impl.BmiDaoImpl;
import org.junit.Test;

import java.util.List;

/**
 * Created by jeffrey on 2019/5/14.
 */
public class TestBmiDao {

    @Test
    public void bmidaotest(){
        BmiDao bmiDao = new BmiDaoImpl();
        List<BmiBean> all = bmiDao.findAll();
//        lamda表达式jdk1.8新特性
        for (BmiBean bmi: all) {
            System.out.println(bmi);
        }
    }
}
