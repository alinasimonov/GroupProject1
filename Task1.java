package project1;

public class Task1 {
    //Create a program that uses an array to store a list of temperatures for
    //a week, and then uses a loop to find the highest and lowest
    //temperature for the week.
    public static void main(String[] args) {

        double [] temp={31,33,37,39,31,28,24};
        double highest=temp[0];
        double lowest=temp[0];
        for(int i =0;i< temp.length;i++){
            if(temp[i]>highest){
                highest=temp[i];
            }
            if(temp[i]<lowest){
                lowest=temp[i];
            }
        }
        System.out.println("The highest temperature of the week is "+highest+" and the lowest temperature of the week is "+lowest);
    }
}
