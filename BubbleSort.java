//Bubble sort - sorts by comparing adjacent elements 

import java.util.*;
class BubbleSort
{
    public static void main(String args[])
    {
        int[] arr = {9,5,8,3,7};
        int n = arr.length;
        for(int i=0; i<n-1; i++)            //this loop is for number of passes
        {
            for(int j=0;j<n-i-1;j++)        //this loop is for comparisons 
            {
                if(arr[j]>arr[j+1])         //swapping
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting - ");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}