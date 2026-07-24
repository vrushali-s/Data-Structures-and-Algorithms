import java.util.*;
class MergeSort
{
    public static void main(String args[])
    {
        int[] unsortedArray = {34,67,23,79,45,12,67};
        int[] sortedArray = mergesort(unsortedArray);
        for(int i=0; i<sortedArray.length; i++)
        {
            System.out.print(sortedArray[i] + " ");
        }
    }

    //merge sort function - divide and recursive calls
    public static int[] mergesort(int[] arr)
    {
        if(arr.length <= 1)
        {
            return arr;
        }
        int mid = arr.length / 2;
        int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

        int[] sortedLeft = mergesort(leftHalf);
        int[] sortedRight = mergesort(rightHalf);

        return merge(sortedLeft, sortedRight); 
    }

    //merge function
    public static int[] merge(int[] left, int[] right)
    {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                result[k++] = left[i++];    //sorrting in ascending order while combining
            }
            else
            {
                result[k++] = right[j++];
            }
            while(i < left.length)
            {
                result[k++] = left[i++];    //remaining elements of left added 
            }
            while(j < right.length)
            {
                result[k++] = right[j++];    //remaining elements of right added 
            }
            
            
        }
        return result;
    }


}