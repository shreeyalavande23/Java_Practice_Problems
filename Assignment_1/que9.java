//9. Write a java program to compute the sum of the first 100 prime numbers.

import java.util.Scanner;



public class que9
 {
    public static void main(String A[]) 
    {
        int count = 0, num = 2, sum = 0; 

        while (count < 100)
        { 
            boolean isPrime = true;  

          
            for (int i = 2; i <= num / 2; i++) 
            {
                if (num % i == 0) 
                {   
                    isPrime = false;        
                    break;  
                }
            }

            if (isPrime) 
            {  
                sum = sum +num;  
                count++;   
            }

            num++;
        }

        
        System.out.println("The sum of the first 100 prime numbers is: " + sum);
    }
}







