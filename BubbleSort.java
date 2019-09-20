
public class BubbleSort implements SortingAlgorithm
{
	
	public void sort(int [] a)
	{
		//integer to store array length
		int n = a.length; 
		//for loop to iterate through each element of the array
        for (int i = 0; i < n-1; i++)
        { 
            for (int j = 0; j < n-i-1; j++)
            { 
                if (a[j] > a[j+1]) 
                { 
                    // this swaps arr[j+1] and arr[i] 
                    int temp = a[j]; 
                    a[j] = a[j+1]; 
                    a[j+1] = temp; 
                } 
            }
        }
        

	}
}