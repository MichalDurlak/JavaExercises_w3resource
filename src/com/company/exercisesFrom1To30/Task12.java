package com.company.exercisesFrom1To30;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first  number: ");
        Integer num1 = in.nextInt();
        System.out.print("Input second number: ");
        Integer num2 = in.nextInt();
        System.out.print("Input third number: ");
        Integer num3 = in.nextInt();

        System.out.printf("The average of the numbers: %d",((num1+num2+num3)/3));

    }
}
