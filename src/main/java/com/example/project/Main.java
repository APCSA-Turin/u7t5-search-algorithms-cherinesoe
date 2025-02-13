package com.example.project;
import java.util.ArrayList;

import com.example.project.Repair.RepairSchedule;

public class Main {
    public static void main(String[] args) {
        RepairSchedule schedule = new RepairSchedule(3); 
        ArrayList<Integer> availableMechanics = schedule.availableMechanics();
        schedule.addRepair(0, 1);
        availableMechanics = schedule.availableMechanics();
        System.out.println(availableMechanics.contains(0));
        System.out.println(availableMechanics.contains(1));
        schedule.addRepair(1, 2);
        availableMechanics = schedule.availableMechanics();
        System.out.println(availableMechanics.contains(1));
    }
}