package com.ivanshestakov.lab1.fundamentals.runner;

import com.ivanshestakov.lab1.fundamentals.calculator.TaskCalculator;
import com.ivanshestakov.lab1.fundamentals.calculator.impl.TaskCalculatorImpl;

public class Runner {

    private final static TaskCalculator calculator = new TaskCalculatorImpl();

    public static void main(String[] args) {

    }

    private static void printFirstTask() {
        final var res = calculator.calculateFirstTask(3,4);
        System.out.println(res);
    }

    private static void printSecondTask() {

    }

    private static void printThirdTask() {

    }

    private static void printFourthTask() {

    }
}
