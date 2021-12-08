package com.company.model;

import com.company.util.Util;

import java.time.LocalDate;

public class Tester extends Employee{
    private int errorNumber;

    public Tester(String name, LocalDate date, String mobile, String email, long basicSalary, int errorNumber) {
        super(name, date, mobile, email, basicSalary);
        this.errorNumber = errorNumber;
    }

    public int getErrorNumber() {
        return errorNumber;
    }

    public void setErrorNumber(int errorNumber) {
        this.errorNumber = errorNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + errorNumber+ " - " + Util.formatNumber(salaryCalculator());
    }

    private long salaryCalculator() {
        return getBasicSalary() + (errorNumber*50000L);
    }
}
