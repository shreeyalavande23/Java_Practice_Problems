// 15. Write a java program to compute the Sum of the principle and secondary diagonals elements of a matrix

import java.util.Scanner;

class que15
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the matrix size : ");
        int n = sobj.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter elements of " + n + "x" + n + " matrix:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = sobj.nextInt();
            }
        }

        int Sum = 0;

        for (int i = 0; i < n; i++) 
        {
            Sum = Sum + matrix[i][i];

            Sum = Sum + matrix[i][n - 1 - i];
        }

        if (n % 2 == 1)
        {
            Sum = Sum - matrix[n / 2][n / 2];
        }

        System.out.println("Sum of principal & secondary diagonals = " + Sum);
        
    }
}
