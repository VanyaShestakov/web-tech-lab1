package com.ivanshestakov.lab1.fundamentals.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import static java.lang.String.format;

@Data
@AllArgsConstructor
public class Pair<F, S> {

    private F first;

    private S second;

    @Override
    public String toString() {
        return "[" + first + ", " + second + "]";
    }

}
