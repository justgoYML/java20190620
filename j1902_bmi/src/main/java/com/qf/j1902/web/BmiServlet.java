package com.qf.j1902.web;

import com.google.gson.Gson;
import com.qf.j1902.bean.BmiBean;
import com.qf.j1902.service.BmiService;
import com.qf.j1902.service.impl.BmiServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



/**
 * Created by jeffrey on 2019/5/14.
 */
public class BmiServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String action = req.getParameter("action");
       if("list".equals(action)){
           System.out.println("list running");
           list(req,resp);
       }else if("delete".equals(action)){
           delete(req,resp);
       }else if("add".equals(action)){
           add(req,resp);
       }
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) {
       String h = req.getParameter("h");
        String w = req.getParameter("w");
        String bmi = req.getParameter("bmi");
        String sign = req.getParameter("sign");
        String mydate = req.getParameter("mydate");
        System.out.println(h+" " +w+" "+bmi+" "+sign+" "+mydate);
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id") == null ? "0" : req.getParameter("id"));
        System.out.println(id);
//        此处执行数据库操作
        //        获取http协议的打印流（响应流）
        PrintWriter out = resp.getWriter();
        out.write("success");
        out.flush();//清空缓存
        out.close();
    }

    //处理查询请求
    private void list(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        BmiService bmiService = new BmiServiceImpl();//此处为硬编码
        List<BmiBean> list = bmiService.queryAllBmi();
        String json = new Gson().toJson(list);//将对象转为json字符串
//        获取http协议的打印流（响应流）
        PrintWriter out = resp.getWriter();
        out.write(json);
        out.flush();//清空缓存
        out.close();
    }
}
