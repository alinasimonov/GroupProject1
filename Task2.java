package project1;

public class Task2 {
    //Create an array of integer values. After the array is created, calculate
    //the sum of all stored elements in that array.
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum+array[i];
        }
        System.out.println(sum);
    }
}