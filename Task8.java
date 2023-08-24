package project1;

public class Task8 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 8, 6, 4, 9, 23, 75, 42};
        int min=nums[0];
        int max=nums[0];
        for(int i=0; i<=9;i++){
            if(nums[i]<min)min=nums[i];
            if(nums[i]>max)max=nums[i];
        }
        System.out.println("The minimum number in the array is "+min+" and the maximum number in the array is "+max);
    }
}
