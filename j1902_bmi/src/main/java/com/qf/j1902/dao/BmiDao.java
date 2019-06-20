package com.qf.j1902.dao;

import com.qf.j1902.bean.BmiBean;

import java.util.List;

/**
 * 提供对bmi数据的将访问接口
 * Created by jeffrey on 2019/5/14.
 */
public interface BmiDao {
    /**
     * 查询所有bmi数据集合
     * @return 对BmiBean对象的封装集合
     */
   public List<BmiBean> findAll();

}
