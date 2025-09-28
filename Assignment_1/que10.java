// 10. Write a java program to swap the first and last elements of an array and create a new array.


import java.util.*;
class que10
{
    public static void main(String A[])
    {
        int[] Arr = {10,20,30};
            
        System.out.println("Original Array : " + Arrays.toString(Arr));            

        int temp = Arr[0];
        Arr[0] = Arr[2];
        Arr[2] = temp;
  
        System.out.println("New Array : " + Arrays.toString(Arr)); 
    }  
}