package project1;

public class Task4 {
    //Create a 2D array of integers. Develop a program which will calculate
    //the sum of even and odd numbers for that array.
    public static void main(String[] args) {
        int [] [] array={
                {4,5,6,7},
                {8,9,10,11},
                {12,13,14,15}};
        int sumE=0;
        int sum0=0;
        for (int[]i:array) {
            for (int b : i) {
                if (b % 2 == 0) {
                    sumE = sumE + b;
                } else if (b % 2 != 0) {
                    sum0 = sum0 + b;
                }
            }
        }
        System.out.println("The sum of even numbers is "+sumE);
        System.out.println("The sum of odd numbers is "+sum0);
    }
}



