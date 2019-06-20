package com.qf.j1902.bean;

/**
 * 对保密数据的封装
 * Created by jeffrey on 2019/5/14.
 */
public class BmiBean {
    private int id;//主键
    private String bmidate;//存储时间
    private String height;//身高cm
    private String weight;//体重kg
    private String bmi;//bmi参数
    private String sign;//有年月组成的标志
    private String username;//用户名

    public BmiBean() {
    }

    @Override
    public String toString() {
        return "BmiBean{" +
                "id=" + id +
                ", bmidate='" + bmidate + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", bmi='" + bmi + '\'' +
                ", sign='" + sign + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBmidate() {
        return bmidate;
    }

    public void setBmidate(String bmidate) {
        this.bmidate = bmidate;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
