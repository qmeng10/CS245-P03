
public class QuickSort implements SortingAlgorithm {

	
	public void sort(int[] a) {
		

		quickSort(a, 0, a.length-1);
	}
		
	public void quickSort(int[] a, int top, int bot) {
		
		int pivot = partition(a, top, bot);
		if(top < pivot - 1) {
			quickSort(a, top, pivot - 1);
		}
		if(pivot < bot) {
			quickSort(a, pivot, bot);
		}
	}
	
	
	public int partition(int [] a, int top, int bot) {
		
		int i = top;
		int j = bot;
		int pivot = (i + j)/2;
		
		while(i <= j) {
			while(a[i] < a[pivot]) {
				i++;
			}
			while (a[j] > a[pivot]) {
				j--;
			}
			if(i <= j) {
				if(i == pivot) {
					pivot = j;
				}else if(j == pivot) {
					pivot = i;
				}swap(a, i++, j--);
				}
			}
		return i;
	}
	
	public void swap(int[] arr, int i,int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
