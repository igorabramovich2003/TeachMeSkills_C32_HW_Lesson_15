package com.teachmeskills.lesson_15.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Task 1
Create a collection of integers and fill it with values entered from the console.
When filling the collection with numbers from the console, you should do type casts.
The following code can be used to cast a string to a number:
int i = Integer.parseInt(str);
or
int val = Integer.valueOf(str);
To finish typing, enter the word "exit".
When casting a string to a number, you should consider the possibility of exceptions.
Some useful code examples for casting a string to a number can be found at the link
https://www.geeksforgeeks.org/how-to-convert-a-string-to-an-int-in-java/
Display even numbers from the collection on the screen.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String value = scanner.nextLine().trim();

                if (value.equalsIgnoreCase("exit")) {
                    break;
                }

                try {
                    list.add(Integer.parseInt(value));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid format");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        for (int i : list) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
