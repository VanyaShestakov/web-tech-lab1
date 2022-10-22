package com.ivanshestakov.lab1.oop.runner;

import com.ivanshestakov.lab1.oop.model.Ball;
import com.ivanshestakov.lab1.oop.model.Basket;
import com.ivanshestakov.lab1.oop.model.book.comparator.BookAuthorComparator;
import com.ivanshestakov.lab1.oop.model.book.comparator.BookPriceComparator;
import com.ivanshestakov.lab1.oop.model.book.comparator.BookTitleComparator;

import java.util.List;

import static com.ivanshestakov.lab1.oop.enums.Color.*;

public class Main {

    public static void main(String[] args) {
        final var basket = new Basket(List.of(
                new Ball(10, 1, BLUE),
                new Ball(10, 1, BLUE),
                new Ball(10, 1, BLUE),
                new Ball(10, 1, BLUE),
                new Ball(10, 1, RED),
                new Ball(10, 1, BLUE),
                new Ball(10, 1, GREEN),
                new Ball(10, 1, RED),
                new Ball(10, 1, BLUE),
                new Ball(10, 1, BLUE)
        ));

        System.out.println(basket.getTotalWeight());
        System.out.println(basket.getBlueBallsAmount());


        final var comparator = new BookTitleComparator();
        final var comparator2 = new BookTitleComparator().thenComparing(new BookAuthorComparator());
        final var comparator3 = new BookAuthorComparator().thenComparing(new BookTitleComparator());
        final var comparator4 = new BookAuthorComparator().thenComparing(new BookTitleComparator()).thenComparing(new BookPriceComparator());
    }

}
