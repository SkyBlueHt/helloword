package com.springmvc.entity;

public class Students {
    private Integer id;

    private String name;

    private String pwd;

    private Integer sex;

    private Integer phoneno;

    private String address;

    private Integer scoresId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(Integer phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getScoresId() {
        return scoresId;
    }

    public void setScoresId(Integer scoresId) {
        this.scoresId = scoresId;
    }
}