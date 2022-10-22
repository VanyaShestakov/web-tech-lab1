package com.ivanshestakov.lab1.fundamentals.calculator.util;

import com.ivanshestakov.lab1.fundamentals.model.Pair;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static java.lang.Math.*;

public class TaskCalculatorUtils {

    public static BiFunction<Double, Double, Double> getExpression() {
        return (x, y) -> (1 + pow(sin(x + y), 2)) / (2 + abs(x - (2 * x) / (1 + pow(x, 2) * pow(y, 2))));
    }

    public static boolean isPrime(final int number) {
        int i = 2;
        while (i <= sqrt(number)) {
            if (number % i == 0) {
               return false;
            }
            i += 1;
        }
        return true;
    }

    public static <E, T> List<Pair<E, T>> convertToPairsWithFirstValues(final E firstValues, final List<T> convertable) {
        return convertable.stream()
                .map(elem -> new Pair<>(firstValues, elem))
                .collect(Collectors.toList());
    }

}
