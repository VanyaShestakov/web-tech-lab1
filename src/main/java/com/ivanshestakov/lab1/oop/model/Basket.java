package com.ivanshestakov.lab1.oop.model;

import com.ivanshestakov.lab1.oop.enums.Color;
import com.ivanshestakov.lab1.oop.exception.BasketSizeOutOfBoundException;

import java.util.List;

import static java.lang.String.format;


public class Basket {

    private final static int MAX_CAPACITY = 100;

    private final List<Ball> balls;


    public Basket(final List<Ball> balls) {
       checkCapacity(getTotalBallsSize(balls));
       this.balls = balls;
    }

    public void addBall(final Ball ball) {
        checkCapacity(getTotalBallsSize(balls) + ball.getSize());
        balls.add(ball);
    }

    public int getTotalWeight() {
        return balls.stream()
                .map(Ball::getWeight)
                .reduce(0, Integer::sum);
    }

    public long getBlueBallsAmount() {
        return balls.stream()
                .filter(ball -> ball.getColor().equals(Color.BLUE))
                .count();
    }

    private int getTotalBallsSize(final List<Ball> balls) {
        return balls.stream()
                .map(Ball::getSize)
                .reduce(0, Integer::sum);
    }

    private void checkCapacity(final int ballsSize) {
        if (ballsSize > MAX_CAPACITY) {
            throw new BasketSizeOutOfBoundException
                    (format("The total size of the balls: %d exceeds the capacity of the basket: %d",
                            ballsSize, MAX_CAPACITY));
        }
    }
}
