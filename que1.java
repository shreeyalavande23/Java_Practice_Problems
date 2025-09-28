// 1. Write a java program to print sum, multiply, subtract, divide and reaminder of two numbers.

import java.util.Scanner;
class que1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int No1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        int No2 = sobj.nextInt();


        System.out.println("Sum of two numbers : "+(No1 + No2));

        System.out.println("Multiplication of two numbers : "+(No1 * No2));

        System.out.println("Division of two numbers : "+(No1 / No2));

        System.out.println("Remainder of two  numbers : "+(No1 % No2));

        sobj.close();
        
    }
}