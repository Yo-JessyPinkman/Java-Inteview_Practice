import java.util.Arrays;

public class RemoveDuplicatesInArray {

	
	///////////////////////// Use Linked Hashset for sorted and unsorted arrays both
	public static int removeDuplicates(int a[], int n) {
		// if(array size if 0 or 1 array is already sorted)
		if (n == 0 || n == 1) {
			return n;
		}

		int j = 0;

		// check if the ith element is not equal to
		// the (i+1)th element, then add that element
		// at the jth index in the same array
		// which indicates that te particular element
		// will only be added once in the array
		for (int i = 0; i < n - 1; i++) {
			System.out.println(a[i]);
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		
		System.out.println(a[n - 1]);
		a[j++] = a[n - 1];
		

		return j;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 5, 3, 2, 1, 3 };
		Arrays.sort(a);
		for(int num : a) 
			System.out.println(num+" ");
		
		int n = a.length;

		int j = 0;

		// the function will modify the array a[]
		// such that the starting j elements
		// will be having all unique elements
		// and no element will be apearing more than
		// once
		j = removeDuplicates(a, n);

		// printing array elements
		for (int i = 0; i < j; i++)
			System.out.print(a[i] + " ");
	}
}
