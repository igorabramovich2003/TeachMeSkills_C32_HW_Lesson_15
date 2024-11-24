package com.teachmeskills.lesson_15.task_2.figure.rectangle;

import com.teachmeskills.lesson_15.task_2.figure.Figure;

public class Rectangle extends Figure {
    private double height, width;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }
}
