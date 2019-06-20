package com.qf.j1902.service.impl;

import com.qf.j1902.bean.BmiBean;
import com.qf.j1902.dao.BmiDao;
import com.qf.j1902.dao.impl.BmiDaoImpl;
import com.qf.j1902.service.BmiService;

import java.util.List;

/**
 * Created by jeffrey on 2019/5/14.
 */
public class BmiServiceImpl implements BmiService{
    @Override
    public List<BmiBean> queryAllBmi() {
        BmiDao bmiDao = new BmiDaoImpl();
        List<BmiBean> all = bmiDao.findAll();
        return all;
    }
}
