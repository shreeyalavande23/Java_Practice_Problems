// 11. Write a java program to count the number of even and odd elements in a given array.

import java.util.Scanner;

class que11
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        
        int size = sobj.nextInt();
        int[] num = new int[size];

        System.out.println("Enter " + size + " integer(s):");
        for (int i = 0; i < size; i++) 
        {
            num[i] = sobj.nextInt();
        }

        int EvenCount = 0;
        int OddCount = 0;

        for (int numbers : num) 
        {
            if (numbers % 2 == 0) 
            {
                EvenCount++;
            } else 
            {
                OddCount++;
            }
        }

        
        System.out.println("Number of Even elements: " + EvenCount);
        System.out.println("Number of Odd elements: " + OddCount);

        sobj.close(); 

    }
}

