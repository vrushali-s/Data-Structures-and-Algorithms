import java.util.*;
class BinarySearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, key;
        System.out.println("Enter size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");  //requires sorted array
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search : ");
        key = sc.nextInt();

        int result = binarysearch(arr, key);
        if(result >= 0)
        {
            System.out.println(key + " present at index " + result);
        }
        else
        {
            System.out.println(key + " not found.");
        }

    }

    public static int binarysearch(int[] a, int key)
    {
        int left = 0;
        int right = a.length-1;
        while(left <= right)
        {
            int mid = (left + right)/2;
            if(a[mid] == key)
            {
                return mid;
            }
            if(a[mid] < key)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }
}