// 7.  Write a program to count the letters,spaces,numbers and other characters of an input string.

import java.util.Scanner;


class que7
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String input = sobj.nextLine();

        int letters = 0;
        int digits = 0;
        int spaces = 0;
        int others = 0;

        for(char ch : input.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                letters++;
            }
            else if(Character.isDigit(ch))
            {
                digits++;
            }
            else if(Character.isSpaceChar(ch))
            {
                spaces++;
            }
            else
            {
            others++;
            }
        }
        System.out.println("Letters : "+letters);
        System.out.println("Digits : "+digits);
        System.out.println("Spaces : "+spaces);
        System.out.println("Other characters : "+others);

    }
}