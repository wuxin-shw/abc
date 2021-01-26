package com.wuxin.pojo;

public class Accounts {
    private int aid;
    private String aname;
    private String acontent;

    @Override
    public String toString() {
        return "Accounts{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", acontent='" + acontent + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent;
    }

    public Accounts(int aid, String aname, String acontent) {
        this.aid = aid;
        this.aname = aname;
        this.acontent = acontent;
    }

    public Accounts() {
    }
}
