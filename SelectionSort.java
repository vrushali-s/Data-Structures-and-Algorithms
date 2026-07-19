class SelectionSort
{
    public static void main(String args[])
    {
        int arr[] = {10,89,45,25,9,7,52};
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            int min_index = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index = j;
                }
            }
            int min_value = arr[min_index];
            for(int k = min_index; k > i; k--)
            {
                arr[k]=arr[k-1];
            }
            arr[i]=min_value;
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

//use of swapping using third variable to put min value at its position in the loop. 
//It swaps direct place to place. so no need of shifting every element of array every time
//int temp = arr[i];
//arr[i] = arr[min_index];
//arr[min_index] = temp;