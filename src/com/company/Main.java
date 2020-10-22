package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose app to start:");
        System.out.println("-------------------");
        System.out.println("Basic Exercises: ");
        System.out.println("1 - 150");
        System.out.println("-------------------");
        System.out.print("Run program number: ");
        int chooseMenu = in.nextInt();

        while(chooseMenu!=0) {
            switch (chooseMenu) {

                case 1:
                    System.out.println("test");
                    break;

                case 2:
                    System.out.println("test1");
                    break;



            }
            break;
        }
    }
}
