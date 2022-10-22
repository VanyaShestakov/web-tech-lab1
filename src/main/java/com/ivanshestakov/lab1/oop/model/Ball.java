package com.ivanshestakov.lab1.oop.model;

import com.ivanshestakov.lab1.oop.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ball {

    private int weight;

    private int size;

    private Color color;

}
