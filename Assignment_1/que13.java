// 13. Write a java program to add numbers without using any arithmetic operators.

import java.util.Scanner;
class que13 
{
    public static int Add(int A, int B) 
    {
        if (B > 0) 
        {
            for (int i = 0; i < B; i++)
            {
                A++;
            }
        } 
        else
        { 
            for (int i = B; i < 0; i++) 
            {
                A--;
            }
        }
        return A;
    }

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = sobj.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = sobj.nextInt();

        System.out.println("Sum = " + Add(num1, num2));
    }
}



    
