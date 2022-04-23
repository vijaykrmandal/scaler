package Day47_TwoPointers;
public class PairwithDifference {

	static int countPairsWithDiffK(int arr[],
									int n, int k)
	{
		int count = 0;

		// Pick all elements one by one
		for (int i = 0; i < n; i++)
		{
			// See if there is a pair
			// of this picked element
			for (int j = i + 1; j < n; j++)
				if ((arr[j] - arr[i] == k)){
                    count++;
                    System.out.println(+i+ ", "+j);
                }
					
		}
		return count;
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = { 8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3 };

		int n = arr.length;
		int k = 3;
		System.out.println("Count of pairs with given diff is "
						+ countPairsWithDiffK(arr, n, k));
	}
}

// This code is contributed
// by Sahil_Bansall
