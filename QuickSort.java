class QuickSort
{
    public static void main(String args[])
    {
        int[] a = {64,56,34,78,12,80,45};
        quickSort(a, 0, a.length-1);

        System.out.println("After Sorting - ");
        for(int value : a)
        {
            System.out.print(value + " ");
        }
 
    }

    public static void quickSort(int[] array,int low, int high)
    {
        if(low < high)
        {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex-1);
            quickSort(array, pivotIndex+1, high);
        }
        for(int value : array)
        {
            System.out.print(value + " ");
        }
        System.out.println("\n");

    }

    public static int partition(int[] array,int low, int high)
    {
        int pivot = array[high];
        int i = low - 1;
        for(int j = low; j < high; j++)
        {
            if(array[j] <= pivot)
            {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;

    }

}