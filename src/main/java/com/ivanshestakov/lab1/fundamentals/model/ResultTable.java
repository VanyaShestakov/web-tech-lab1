package com.ivanshestakov.lab1.fundamentals.model;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.StringJoiner;

@RequiredArgsConstructor
public class ResultTable {

    private final List<Pair<Double, Double>> value;

    @Override
    public String toString() {
        final var header = "[f, x]";
        final var joiner = new StringJoiner("\n");
        joiner.add(header);
        value.forEach(pair -> joiner.add(pair.toString()));
        return joiner.toString();
    }

}
