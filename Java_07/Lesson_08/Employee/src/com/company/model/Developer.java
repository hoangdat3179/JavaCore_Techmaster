package com.company.model;

import com.company.util.Util;

import java.time.LocalDate;

public class Developer extends Employee {
    private int overtime;

    public Developer(String name, LocalDate date, String mobile, String email, long basicSalary, int overtime) {
        super(name, date, mobile, email, basicSalary);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }


    public long salaryCalculator(){
        return getBasicSalary() + (overtime* 200000L);
    }

    @Override
    public String toString() {
        return super.toString() + " - " + overtime + " - " + Util.formatNumber(salaryCalculator());
    }
}
