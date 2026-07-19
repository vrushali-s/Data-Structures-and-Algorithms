class InsertionSort
{
    public static void main(String args[])
    {
        int[] arr = {45,65,23,78,30};
        int n = arr.length;
        for(int i=1 ; i<n; i++)         //started with i=1 because i=0 is considered as sorted 
        {
            int insertIndex = i;        //index where unsorted array starts
            int currentValue = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > currentValue)
            {
                arr[j+1] = arr[j];
                insertIndex = j;
                j--;
            }
            arr[insertIndex] = currentValue;
        }
        System.out.println("Sorted Array - ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}