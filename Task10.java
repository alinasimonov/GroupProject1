package project1;

public class Task10 {
    // Write a program to print out duplicate elements from an Array of
    //Strings?

    public static void main(String[] args) {
        String [] names={"Alina", "Alex", "Emma", "Elise", "David", "Alex", "Max", "Sarah"};
        for (int i = 0; i <names.length-1 ; i++)
        {
            for (int j=i+1; j<names.length ; j++)
            {
                if ((names[i].equals(names[j])) && (i!=j))
                {
                    System.out.println("Duplicate name is: "+names[j]);
                }
            }
        }
    }
}

