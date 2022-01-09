package com.company.exercisesFrom1To30;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(number+"*"+i+"="+number*i);
        }
    }
}
