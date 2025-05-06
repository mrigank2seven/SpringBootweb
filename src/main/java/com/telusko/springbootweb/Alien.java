package com.telusko.springbootweb;

public class Alien {

    private int aid;
    private String aName;
    private String courseName;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAName() {
        return aName;
    }

    public void setAName(String aName) {
        this.aName = aName;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aName=" + aName + ", courseName=" + courseName + "]";
    }
}
