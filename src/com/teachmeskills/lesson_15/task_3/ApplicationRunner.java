package com.teachmeskills.lesson_15.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Task 3
Create a collection of integers.
Fill the collection with random numbers.
Let the collection size be specified from the console.
Provide a check for validity of the entered collection size.
Calculate and display the arithmetic mean of all elements of the collection.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                int random = (int) (Math.random() * 101);
                list.add(random);
            }
            System.out.println(list);
            double sum = 0;
            for (Integer num : list) {
                sum += num;
            }
            System.out.println(sum/n);

        }catch (Exception e) {
            System.out.println("Invalid size");
        }
    }
}
