import java.util.*;
class LinearSearch
{
    public static void main(String args[])
    {
        int[] arr = {6,5,4,8,2,9,7};
        int search = 2;
        int res = linearsearch(arr, search);
        if(res >= 0)
        {
            System.out.println("Element found at index " + res);
        }
        else
        {
            System.out.println("Element not found.");
        }

    }

    public static int linearsearch(int[] a, int key)
    {
        for(int i = 0; i< a.length; i++)
        {
            if(a[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
}