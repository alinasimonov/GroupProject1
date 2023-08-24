package project1;

import java.util.Scanner;

public class Task6 {
    //Write a java program to check whether a given number is prime or
    //not?
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        boolean cond=false;
        for (int i = 2; i <=number/2 ; i++) {
            if(number%i==0){
                cond=true;
                break;
            }
        }
        if (!cond)
            System.out.println(number+" is a prime number!");
        else System.out.println(number+" is not a prime number!");
    }
}

