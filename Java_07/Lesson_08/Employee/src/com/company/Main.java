package com.company;


import com.company.controller.Controller;
import com.company.model.Developer;
import com.company.model.Tester;
import com.company.util.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);
        ArrayList<Developer> developers = new ArrayList<>();
        ArrayList<Tester> testers = new ArrayList<>();
        boolean isContinue = false;

        while(!isContinue){
            Menu.mainMenu();
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    controller.insertDevelopers(developers,choose);
                    break;
                case 2:
                    controller.insertTesters(testers, choose);
                    break;
                case 3:
                    controller.printListDeveloper(developers);
                    break;
                case 4:
                    controller.printListTester(testers);
                    break;
                case 0:
                    isContinue = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này!!!");
            }
        }
    }
}
