package project1;

public class Task9 {
    //Write a java program to find the second largest number in the array?
    public static void main(String[] args) {
            int [] numbers={12,13,15,18,20,22,24,56,45};
            int size=numbers.length;
            int n;
            for (int i = 0; i <size ; i++) {
                for (int j = i+1; j <size ; j++) {
                    if (numbers[i]>numbers[j]){
                        n=numbers[i];
                        numbers[i]=numbers[j];
                        numbers[j]=n;
                    }
                }
            }
            System.out.println("The second largest number is "+numbers[size-2]);
        }
    }




