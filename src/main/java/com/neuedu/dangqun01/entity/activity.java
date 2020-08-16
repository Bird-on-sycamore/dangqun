package com.neuedu.dangqun01.entity;

import java.util.Date;

public class activity {
    private Integer id;

    private Integer kind;

    private Integer locatedid;

    private String name;

    private Date date;

    private Date endtime;

    private String restriction;

    private Integer checkedmax;

    private Integer checkedcurrent;

    private String description;

    private String imgpath;

    private Date holdtime;

    private String timelength;

    private Integer point;

    private Integer back01;

    private Integer back02;

    private String back03;

    private String back04;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public Integer getLocatedid() {
        return locatedid;
    }

    public void setLocatedid(Integer locatedid) {
        this.locatedid = locatedid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction == null ? null : restriction.trim();
    }

    public Integer getCheckedmax() {
        return checkedmax;
    }

    public void setCheckedmax(Integer checkedmax) {
        this.checkedmax = checkedmax;
    }

    public Integer getCheckedcurrent() {
        return checkedcurrent;
    }

    public void setCheckedcurrent(Integer checkedcurrent) {
        this.checkedcurrent = checkedcurrent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public Date getHoldtime() {
        return holdtime;
    }

    public void setHoldtime(Date holdtime) {
        this.holdtime = holdtime;
    }

    public String getTimelength() {
        return timelength;
    }

    public void setTimelength(String timelength) {
        this.timelength = timelength == null ? null : timelength.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}