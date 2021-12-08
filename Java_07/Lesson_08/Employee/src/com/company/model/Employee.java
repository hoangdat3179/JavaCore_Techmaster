package com.company.model;

import com.company.util.Util;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private LocalDate date; //Thay tuổi bằng ngày sinh cho chi tiết
    private String mobile;
    private String email;
    private long basicSalary;

    public Employee(String name, LocalDate date, String mobile, String email, long basicSalary) {
        this.id = Util.generateId(5); //Sinh id ngẫu nhiên gồm 5 ký tự
        this.name = name;
        this.date = date;
        this.mobile = mobile;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + Util.formatDate(date) + " - " + mobile + " - " + email + " - " + Util.formatNumber(basicSalary);
    }
}
