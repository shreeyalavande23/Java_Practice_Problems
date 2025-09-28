//5. Write a program and compute the sum of the digits of an integer.

import java.util.Scanner;

class que5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sobj.nextInt();

        int Sum = 0;
        
        while(num != 0)
        {
            Sum = Sum + (num%10);
            num = num/10;
          
        }
        System.out.println("The sum of the digits are : "+Sum);
    }
}

  