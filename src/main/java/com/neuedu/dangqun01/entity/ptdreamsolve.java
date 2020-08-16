package com.neuedu.dangqun01.entity;

import java.util.Date;

public class ptdreamsolve {
    private Integer id;

    private Integer dreamid;

    private Integer userid;

    private Integer locatedid;

    private String reply;

    private Integer solvedlevel;

    private Integer back01;

    private Integer back02;

    private String back03;

    private String back04;

    private Date solvedate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDreamid() {
        return dreamid;
    }

    public void setDreamid(Integer dreamid) {
        this.dreamid = dreamid;
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

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply == null ? null : reply.trim();
    }

    public Integer getSolvedlevel() {
        return solvedlevel;
    }

    public void setSolvedlevel(Integer solvedlevel) {
        this.solvedlevel = solvedlevel;
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

    public Date getSolvedate() {
        return solvedate;
    }

    public void setSolvedate(Date solvedate) {
        this.solvedate = solvedate;
    }
}