// 8. Write a java program to print the even and odd numbers from 1 to 20 
// by using call to two different methods belongs same super class.

import java.util.Scanner;

class PrintNumbers
{
    public void printEvenNumbers()
    {
        System.out.println("Even numbers from 1 to 20 : ");
        for(int i = 1; i <= 20; i ++)
        {
            if(i %2 == 0)
            {
                System.out.println( i + " ");
            }
        }
        System.out.println();
    }
    public void pritOddNumbers()
    {
        System.out.println("Odd numbers from 1 to 20 : ");
        for(int i = 1; i <= 20 ; i++)
        {
            if(i %2 != 0)
            {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
public class que8
{
    public static void main(String A[])
    {
        PrintNumbers print = new PrintNumbers();

        print.printEvenNumbers();

        print.pritOddNumbers();

    }
}