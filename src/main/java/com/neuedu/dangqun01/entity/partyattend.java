package com.neuedu.dangqun01.entity;

import java.util.Date;

public class partyattend {
    private Integer id;

    private Integer activityid;

    private Integer userid;

    private Integer locatedid;

    private Integer attend;

    private Date begintime;

    private Date endtime;

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

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getLocatedid() {
        return locatedid;
    }

    public void setLocatedid(Integer locatedid) {
        this.locatedid = locatedid;
    }

    public Integer getAttend() {
        return attend;
    }

    public void setAttend(Integer attend) {
        this.attend = attend;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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