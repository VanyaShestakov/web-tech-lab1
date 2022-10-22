package com.ivanshestakov.lab1.fundamentals.calculator.impl;

import com.ivanshestakov.lab1.fundamentals.calculator.TaskCalculator;
import com.ivanshestakov.lab1.fundamentals.model.Pair;
import com.ivanshestakov.lab1.fundamentals.model.ResultTable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.ivanshestakov.lab1.fundamentals.calculator.util.TaskCalculatorUtils.*;
import static java.lang.Math.tan;

public class TaskCalculatorImpl implements TaskCalculator {

    @Override
    public double calculateFirstTask(final double x, final double y) {
        final var expression = getExpression();
        return expression.apply(x, y);
    }

    @Override
    public boolean calculateSecondTask(final Pair<Integer, Integer> point) {
        final var x = point.getFirst();
        final var y = point.getSecond();

        if (y <= 5 && y > 0) {
            return x >= -4 && x <= 4;
        } else if (y <= 0 && y >= -3) {
            return x >= -6 && x <= 6;
        } else {
            return false;
        }
    }

    @Override
    public ResultTable getResultTableThirdTask(double a, double b, double h, double x) {
        final var pairs = new ArrayList<Pair<Double, Double>>();
        while (x <= b) {
            if (!(x < a)) {
                final var f = tan(x);
                pairs.add(new Pair<>(f, x));
            }
            x += h;
        }
        return new ResultTable(pairs);
    }

    @Override
    public List<Integer> getPrimesIndexesFourthTask(int[] arr) {
        return IntStream.range(0, arr.length)
                .filter(index -> isPrime(arr[index]))
                .boxed()
                .collect(Collectors.toList());
    }

    @Override
    public int getRemovedAmountFifthTask(final int[] array) {
        var num = array[0];
        var amount = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > num) {
                num = array[i];
            } else {
                amount++;
            }
        }
        return amount;
    }

    @Override
    public int[][] getMatrixFromArraySixthTask(final int[] array) {
        final int[][] result = new int[array.length][array.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = array[((i + j) % array.length)];
            }
        }
        return result;
    }

    @Override
    public void sortShellSeventhTask(final int[] array) {
        for (int tmp = array.length / 2; tmp > 0; tmp /= 2) {
            for (int i = tmp; i < array.length; i += 1) {
                int x = array[i];
                int j;
                for (j = i; j >= tmp && array[j - tmp] > x; j -= tmp) {
                    array[j] = array[j - tmp];
                }
                array[j] = x;
            }
        }
    }

    //Returns result indexes of the second sequence after insertion
    @Override
    public List<Integer> getInsertedIndexesEighthTask(final List<Integer> first, final List<Integer> second) {
        final var firstPairs = convertToPairsWithFirstValues("first", first);
        final var secondPairs = convertToPairsWithFirstValues("second", second);
        final var resultPairedSequence = Stream
                .concat(firstPairs.stream(), secondPairs.stream())
                .sorted(Comparator.comparing(Pair::getSecond))
                .collect(Collectors.toList());
        return IntStream.range(0, resultPairedSequence.size())
                .filter(index -> resultPairedSequence.get(index).getFirst().equals("second"))
                .boxed()
                .collect(Collectors.toList());

    }

 }
