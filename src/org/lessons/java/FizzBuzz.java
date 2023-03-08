package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a number between 1 and 1000: ");
        int random = Integer.parseInt(scan.nextLine());

        if (random > 0 || random <= 1000){
            for (int i = 1; i <= random; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0 || i % 5 == 0){
                    if (i % 3 == 0) {
                        System.out.println("Fizz");
                    }else if(i % 5 == 0){
                        System.out.println("Buzz");
                    }
                    }else {
                    System.out.println(i);
                }

                }
            }
        }
    }
