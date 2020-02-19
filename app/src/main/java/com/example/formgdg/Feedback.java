package com.example.formgdg;

import java.io.Serializable;

public class Feedback implements Serializable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getVIP() {
        return VIP;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    public String getPastexp() {
        return pastexp;
    }

    public void setPastexp(String pastexp) {
        this.pastexp = pastexp;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getNameperson() {
        return nameperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAgree() {
        return isAgree;
    }

    public void setAgree(boolean agree) {
        isAgree = agree;
    }
    String name;
    String email;
    String college;
    String mobile;
    String link;
    String facebook;
    String github;
    String resume;
    String VIP;
    String pastexp;
    String other;
    String nameperson;
    String about;
    int age;
    boolean isAgree;

    public Feedback(String name, String email, String college, String mobile, String link, String facebook, String github, String resume, String VIP, String pastexp, String other, String nameperson, String about, int age, boolean isAgree) {
        this.name = name;
        this.email = email;
        this.college = college;
        this.mobile = mobile;
        this.link = link;
        this.facebook = facebook;
        this.github = github;
        this.resume = resume;
        this.VIP = VIP;
        this.pastexp = pastexp;
        this.other = other;
        this.nameperson = nameperson;
        this.about = about;
        this.age = age;
        this.isAgree = isAgree;
    }
}
