package com.ivanshestakov.lab1.fundamentals.calculator;

import com.ivanshestakov.lab1.fundamentals.model.Pair;
import com.ivanshestakov.lab1.fundamentals.model.ResultTable;

import java.util.List;

public interface TaskCalculator {

    double calculateFirstTask(final double x, final double y);

    boolean calculateSecondTask(final Pair<Integer, Integer> point);

    ResultTable getResultTableThirdTask(final double a, final double b, final double h, final double x);

    List<Integer> getPrimesIndexesFourthTask(final int[] arr);

    int getRemovedAmountFifthTask(int[] array);

    int[][] getMatrixFromArraySixthTask(int[] array);

    void sortShellSeventhTask(int[] array);

    //Returns result indexes of the second sequence after insertion
    List<Integer> getInsertedIndexesEighthTask(List<Integer> first, List<Integer> second);
}
