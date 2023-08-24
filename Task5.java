package project1;

public class Task5 {
    // Write a program to swap 2 numbers without a temporary variable?
    public static void main(String[] args) {
        int a=5;
        int b=10;

        int temp = a;
        a=b;
        b=temp;
        System.out.println("The value of a is "+ a + " and the value of b is "+b );

    }
}
