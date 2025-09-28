//6. Write a java program to comapre two numbers.

import java.util.Scanner;

class que6
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int No1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        int No2 = sobj.nextInt();

        if(No1 > No2)
        {
            System.out.println("First number is greater  than second number ");
        }
        else
        {
            System.out.println("First number is smaller than second number ");

        }
    }
}