

public class SelectionSort implements SortingAlgorithm {


	public void sort(int[] a) {
		
		for(int i = 0; i < a.length-1; i++) {
			int smallest = smallest(a, i);
			swap(a, smallest, i);
		}

	}
	
	public void swap(int[] a, int i, int j) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public int smallest(int [] arr, int start) {
		
		int smallest = start;
		for(int i = start + 1; i < arr.length; i++) {
			if(arr[i] < arr[smallest]) {
				smallest = i;
			}
		}
		return smallest;
	}
	
}
