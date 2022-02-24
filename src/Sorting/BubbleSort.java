package Sorting;

public class BubbleSort {
	
	    void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap array[j+1] and array[j]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }
	  
	    /* Prints the array */
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	  
	
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	BubbleSort ob = new BubbleSort();
	        int arr[] = {78, 32, 21, 11, 23, 67, 99};
	        ob.bubbleSort(arr);
	        System.out.println("Sorted array");
	        ob.printArray(arr);

	}

}
