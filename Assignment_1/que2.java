// 2. Write a java program that takes five numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class que2 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int No1,No2,No3,No4,No5;
        double Avg;

        System.out.println("Enter the five numbers :  ");

        No1 = sobj.nextInt(); 
        No2 = sobj.nextInt(); 
        No3 = sobj.nextInt(); 
        No4 = sobj.nextInt(); 
        No5 = sobj.nextInt(); 

        Avg = (No1 + No2 + No3 + No4 + No5)/5;
        
        System.out.println("The average of 5 numbers are : "+Avg);

        


    }
}
