package com.hut.crazyacking.model;

import java.util.Date;

/**
 * @author : crazyacking
 * @date : 2016/12/17
 */
public class SignUpType {
    private int id;
    private String signUpKey;
    private String signUpName;
    private String status;
    private Date createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSignUpKey() {
        return signUpKey;
    }

    public void setSignUpKey(String signUpKey) {
        this.signUpKey = signUpKey;
    }

    public String getSignUpName() {
        return signUpName;
    }

    public void setSignUpName(String signUpName) {
        this.signUpName = signUpName;
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
        return "SignUpType{" +
                "id=" + id +
                ", signUpKey='" + signUpKey + '\'' +
                ", signUpName='" + signUpName + '\'' +
                ", status='" + status + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
