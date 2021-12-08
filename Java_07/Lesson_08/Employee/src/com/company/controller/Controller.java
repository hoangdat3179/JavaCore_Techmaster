package com.company.controller;

import com.company.model.Developer;
import com.company.model.Tester;
import com.company.service.Service;

import java.util.ArrayList;

public class Controller {

    Service service;

    public Controller() {
        service = new Service();
    }

    public ArrayList<Developer> insertDevelopers(ArrayList<Developer> list, int choice){
        list.add((Developer) service.insertEmployee(choice));
        return list;
    }

    public ArrayList<Tester> insertTesters(ArrayList<Tester> list, int choice){
        list.add((Tester) service.insertEmployee(choice));
        return list;
    }

    public void printListDeveloper(ArrayList<Developer> list){
        for (Developer developer: list) {
            System.out.println(developer);
        }
    }

    public void printListTester(ArrayList<Tester> list){
        for (Tester tester: list) {
            System.out.println(tester);
        }
    }


}
