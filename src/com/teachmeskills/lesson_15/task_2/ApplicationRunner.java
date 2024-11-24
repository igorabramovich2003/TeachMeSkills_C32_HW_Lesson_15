package com.teachmeskills.lesson_15.task_2;

import com.teachmeskills.lesson_15.task_2.figure.Figure;
import com.teachmeskills.lesson_15.task_2.figure.circle.Circle;
import com.teachmeskills.lesson_15.task_2.figure.rectangle.Rectangle;
import com.teachmeskills.lesson_15.task_2.figure.triangle.Triangle;
import com.teachmeskills.lesson_15.task_2.figure_service.FigureShow;

import java.util.ArrayList;
import java.util.List;
/*
Task 2
Create a collection of shapes.
(take the classes for shapes from previous homework)
Fill the collection with different shapes.
Loop through the collection and call a method to calculate and display the perimeter of each shape.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(9);
        Triangle triangle = new Triangle(10, 15, 10);
        Rectangle rectangle = new Rectangle(7, 9);
        List<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(triangle);
        figures.add(rectangle);
        FigureShow.showPerimeter(figures);

    }
}
