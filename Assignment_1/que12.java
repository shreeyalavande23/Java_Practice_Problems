// 12. Write a java program to check if a positive number is palindrome or not.

import java.util.Scanner;

class que12
{
    public static void main(String[] args) 
    {  
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter a number: ");

        int num= sobj.nextInt();
        int original = num;
        int reversed = 0;

        while (num != 0)
        {
            reversed = reversed* 10+num % 10;
            num = num / 10;
        }
        
    
        if (original == reversed)
        {
            System.out.println(original + " is a palindrome.");

        }
        else
        {
            System.out.println(original + " is not a palindrome.");
        }
    }
}    


