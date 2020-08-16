package com.neuedu.dangqun01.entity;

public class dream {
    private Integer id;

    private Integer useid;

    private Integer located;

    private String name;

    private String imgpath;

    private Integer adopted;

    private Integer solved;

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

    public Integer getUseid() {
        return useid;
    }

    public void setUseid(Integer useid) {
        this.useid = useid;
    }

    public Integer getLocated() {
        return located;
    }

    public void setLocated(Integer located) {
        this.located = located;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public Integer getAdopted() {
        return adopted;
    }

    public void setAdopted(Integer adopted) {
        this.adopted = adopted;
    }

    public Integer getSolved() {
        return solved;
    }

    public void setSolved(Integer solved) {
        this.solved = solved;
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