package com.apjfsa;

import java.util.Scanner;

public class StudentMarks1 {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declaring an array to store marks of 6 subjects
        int marks[] = new int[6];

        // Prompting the user to enter marks
        System.out.println("Enter Marks: ");

        // Initializing variable to store total marks
        int total = 0;

        // Variable to store average marks
        double average;

        // Loop to access array elements and calculate total marks
        for (int i = 0; i < marks.length; i++) {
            // Reading marks from the user and storing in the array
            marks[i] = sc.nextInt();

            // Adding the mark to the total
            total += marks[i];
        }

        // Calculating the average marks
        average = total / marks.length;

        // Displaying the total marks
        System.out.println("Total marks: " + total);

        // Displaying the average marks
        System.out.println("Average marks: " + average);

        // Checking if the student has passed or failed
        int i = 0;
        if (marks[i] >= 35) {
            // If the mark is 35 or more, the student has passed
            System.out.println("result=pass");
        } else {
            // If the mark is less than 35, the student has failed
            System.out.println("result=fail");
        }
    }
}
