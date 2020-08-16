package com.neuedu.dangqun01.entity;

public class user {
    private Integer id;

    private Integer role;

    private String password;

    private String username;

    private String telephone;

    private String description;

    private String imgparh;

    private String career;

    private String company;

    private Float point;

    private Integer locatedid;

    private Integer back01;

    private Integer back02;

    private String back03;

    private String back04;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImgparh() {
        return imgparh;
    }

    public void setImgparh(String imgparh) {
        this.imgparh = imgparh == null ? null : imgparh.trim();
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Float getPoint() {
        return point;
    }

    public void setPoint(Float point) {
        this.point = point;
    }

    public Integer getLocatedid() {
        return locatedid;
    }

    public void setLocatedid(Integer locatedid) {
        this.locatedid = locatedid;
    }

    public Integer getBack01() {
        return back01;
    }

    public void setBack01(Integer back01) {
        this.back01 = back01;
    }

    public Integer getBack02() {
        return back02;
    }

    public void setBack02(Integer back02) {
        this.back02 = back02;
    }

    public String getBack03() {
        return back03;
    }

    public void setBack03(String back03) {
        this.back03 = back03 == null ? null : back03.trim();
    }

    public String getBack04() {
        return back04;
    }

    public void setBack04(String back04) {
        this.back04 = back04 == null ? null : back04.trim();
    }
}