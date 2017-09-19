
public class BubbleSort implements SortingAlgorithm {

	public void sort(int[] a) {
	for(int j = 0; j < a.length-1; j++) {
		for(int i = 0; i < a.length-j-1; i++) {
			if(a[i] > a[i+1]) {
				swap(a, i, i+1);
			}
		}
	}

	}
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
