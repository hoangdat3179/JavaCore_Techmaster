package com.company.service;

import com.company.model.Developer;
import com.company.model.Employee;
import com.company.model.Tester;
import com.company.util.Menu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    public Employee insertEmployee(int choice){
        Employee employee = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày, tháng, năm sinh: ");
        System.out.print("Ngày: ");
        int day = sc.nextInt();
        System.out.print("Tháng: ");
        int month = sc.nextInt();
        System.out.print("Năm: ");
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String mobile = sc.nextLine();
        System.out.print("Nhập email: ");
        String email = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        long salary = sc.nextLong();
        if(choice == 1){
            System.out.print("Nhập số giờ tăng ca: ");
            int overtime = sc.nextInt();
            employee = new Developer(name, date, mobile, email, salary, overtime);
        }else if(choice == 2){
            System.out.print("Nhập sô lỗi tìm được: ");
            int errorNumber = sc.nextInt();
            employee = new Tester(name, date, mobile, email, salary, errorNumber);
        }
        return employee;
    }
}
