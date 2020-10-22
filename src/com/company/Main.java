package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose app to start:");
        System.out.println("-------------------");
        System.out.println("Basic Exercises: ");
        System.out.println("1 - 150");
        // https://www.w3resource.com/java-exercises/basic/index.php
        System.out.println("-------------------");
        System.out.print("Run program number: ");
        int chooseMenu = in.nextInt();

        while(chooseMenu!=0) {
            switch (chooseMenu) {

                case 1:
                    System.out.println("Hello");
                    System.out.println("Michal D");
                    break;

                case 2:
                    System.out.println(74+36);
                    break;

                case 3:
                    System.out.println(50/3);
                    break;

                case 4:
                    System.out.println(74+36);
                    System.out.println("a. " + (-5 + 8 * 6));
                    System.out.println("b. " + ((55+9) % 9));
                    System.out.println("c. " + (20 + -3*5 / 8));
                    System.out.println("d. " + (5 + 15 / 3 * 2 - 8 % 3));
                    break;

                case 5:
                    System.out.println("Provide us two random numbers: ");
                    System.out.print("First number: ");
                    int exercise5_numer1 = in.nextInt();
                    System.out.print("Second number: ");
                    int exercise5_numer2 = in.nextInt();
                    System.out.println("Here is product of these two numbers: "+ (exercise5_numer1*exercise5_numer2));
                    break;

                case 6:
                    System.out.println("Provide us two random numbers: ");
                    System.out.print("First number: ");
                    int exercise6_numer1 = in.nextInt();
                    System.out.print("Second number: ");
                    int exercise6_numer2 = in.nextInt();
                    System.out.println("Here is addition of these two numbers: "+ (exercise6_numer1 + exercise6_numer2));
                    System.out.println("Here is multiply of these two numbers: "+ (exercise6_numer1 - exercise6_numer2));
                    System.out.println("Here is subtract of these two numbers: "+ (exercise6_numer1 * exercise6_numer2));
                    System.out.println("Here is divide of these two numbers: "+ (exercise6_numer1 / exercise6_numer2));
                    System.out.println("Here is reminder of these two numbers: "+ (exercise6_numer1 % exercise6_numer2));
                    break;

                case 7:
                    System.out.println("Provide us one random number: ");
                    System.out.print("Number: ");
                    int exercise7_numer1 = in.nextInt();

                    for (int exercise7_temp = 1 ; exercise7_temp<=10; exercise7_temp++){
                        System.out.println(exercise7_numer1+" x "+exercise7_temp + " = " + (exercise7_numer1 * exercise7_temp));
                    }
                    break;
                case 8:
                    System.out.println("   J    a   v     v  a     ");
                    System.out.println("   J   a a   v   v  a a    ");
                    System.out.println("J  J  aaaaa   V V  aaaaa   ");
                    System.out.println(" JJ  a     a   V  a     a  ");
                    break;

                case 9:
                    System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

                case 10:
                    System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));

                case 11:
                    double exercise11_radius = 7.5;
                    double exercise11_pi = 3.14;
                    System.out.println("Perimeter of a circle: " + ((2 * exercise11_pi) * exercise11_radius));
                    System.out.println("Area of a circle: " + (exercise11_pi * (exercise11_radius * exercise11_radius)));
                    break;

                case 12:
                    System.out.println("Provide us three random numbers: ");
                    System.out.print("First number: ");
                    int exercise12_numer1 = in.nextInt();
                    System.out.print("Second number: ");
                    int exercise12_numer2 = in.nextInt();
                    System.out.print("Thrid number: ");
                    int exercise12_numer3 = in.nextInt();

                    System.out.println("The avarage of these numbers ("+ exercise12_numer1 +", " + exercise12_numer2 +", "+exercise12_numer3+") is: "+ ((exercise12_numer1 + exercise12_numer2 + exercise12_numer3)/3));

                case 13:
                    double exercise13_width = 5.6;
                    double exercise13_height = 8.5;

                    double exercise13_area = (exercise13_height * exercise13_width);
                    exercise13_area = exercise13_area*100;
                    exercise13_area = Math.round(exercise13_area);
                    exercise13_area = exercise13_area/100;

                    System.out.println("Perimeter of a rectangle: " + (2*(exercise13_width + exercise13_height)));
                    System.out.println("Area of a rectangle: " + exercise13_area);
                    break;

                case 14:
                    for (int exercise14_temp = 0; exercise14_temp <= 3;exercise14_temp++){
                        System.out.println("* * * * * * ==================================");
                        System.out.println(" * * * * *  ==================================   ");
                    }

                    System.out.println("* * * * * * ==================================  ");

                    for (int exercise14_temp = 0; exercise14_temp <= 6;exercise14_temp++){
                        System.out.println("==============================================");

                    }
                    break;

                case 15:
                    int abc = 38;
                    int cba = 15;
                    System.out.println("Before swap");
                    System.out.println("Value name ABC: " + abc);
                    System.out.println("Value name CBA: " + cba);

                    System.out.println();
                    int temp = 0;
                    temp = abc;
                    abc = cba;
                    cba = temp;
                    System.out.println("After swap");
                    System.out.println("Value name ABC: " + abc);
                    System.out.println("Value name CBA: " + cba);

                case 16:

                    System.out.println(" +\"\"\"\"\"+                                                 \n" +
                            "[| o o |]                                                \n" +
                            " |  ^  |                                                 \n" +
                            " | '-' |                                                 \n" +
                            " +-----+");

                case 17:



            }
            break;
        }
    }
}
