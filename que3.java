// Write a java program to convert a decimal number to binary number.

import java.util.Scanner;

class que3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
    
        System.out.println("Enter a decimal number : ");
        int num = sobj.nextInt();

        System.out.println("Binary : "+Integer.toBinaryString(num));

        sobj.close();
    }
}