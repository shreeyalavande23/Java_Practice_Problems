// Write a java program to convert binary number to decimal number.


import java.util.Scanner;

class que4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
    
        System.out.println("Enter a binary number : ");
        String binary = sobj.nextLine();

        int decimal = Integer.parseInt(binary,2);
        System.out.println("Decimal : "+decimal);

        sobj.close();
    }
}