package com.company.exercisesFrom1To30;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input decimal number to convert: ");
        int number = in.nextInt();
        System.out.println("Hexadecimal number is: " + Integer.toHexString(number).toUpperCase());
    }

}
