package com.hut.crazyacking.model;

import java.util.Date;

/**
 * @author : crazyacking
 * @date : 2016/12/17
 */
public class SignUp {
    private int id;
    private String stuName;
    private String signUpKey;
    private String contactor;
    private String phone;
    private String qq;
    private String weiChart;
    private String address;
    private String status;
    private Date createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getSignUpKey() {
        return signUpKey;
    }

    public void setSignUpKey(String signUpKey) {
        this.signUpKey = signUpKey;
    }

    public String getContactor() {
        return contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeiChart() {
        return weiChart;
    }

    public void setWeiChart(String weiChart) {
        this.weiChart = weiChart;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "SignUp{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", signUpKey='" + signUpKey + '\'' +
                ", contactor='" + contactor + '\'' +
                ", phone='" + phone + '\'' +
                ", qq='" + qq + '\'' +
                ", weiChart='" + weiChart + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
