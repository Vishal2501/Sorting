package Sorting;

public class NewSort {void sort(int arr[])
{
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;

        /* Move elements of array[0..i-1], that are
           greater than key, to one position ahead
           of their current position */
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

/* A utility function to print array of size n*/
static void printArray(int arr[])
{
    int n = arr.length;
    for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");

    System.out.println();
}

// Driver method
public static void main(String args[])
{		// TODO Auto-generated method stub
    int arr[] = { 98, 22, 14, 8, 56 };

    NewSort ob = new NewSort();
    ob.sort(arr);

    printArray(arr);
}
}

