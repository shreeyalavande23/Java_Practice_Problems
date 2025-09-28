// 14. Write a java program to add all the digits of a given positive number.

import java.util.Scanner;

class que14
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int  num = sobj.nextInt();

        int Sum = 0;

        while(num > 0)
        {
            int Digit = num % 10;
            Sum = Sum + Digit;
            num= num / 10;
        }
        System.out.println("Sum of digits = "+ Sum);

        sobj.close();
    }
}



        
      