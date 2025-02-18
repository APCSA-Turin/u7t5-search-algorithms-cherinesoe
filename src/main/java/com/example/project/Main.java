package com.example.project;
import java.util.ArrayList;

import com.example.project.Binary_Search.BinarySearch;
import com.example.project.Repair.RepairSchedule;
import com.example.project.Spell_Checker.SpellChecker;

public class Main {
    public static void main(String[] args) {
        SpellChecker checker = new SpellChecker();
        boolean result = checker.binarySpellCheck("lightered");
        System.out.println(checker.getLoopCounter());
        System.out.println(result);
    }
}