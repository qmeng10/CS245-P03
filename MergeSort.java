
public class MergeSort implements SortingAlgorithm {

	
	public void sort(int[] a) {
		
		if(a.length < 2) {
			return;
		}
		int mid = a.length/2;
		int top[] = new int[mid];
		int bot[] = new int[a.length - mid];
		
		for(int i = 0; i < mid; i++) {
			top[i] = a[i];
		}
		
		for(int i = mid; i < a.length; i++) {
			bot[i - mid] = a[i];
		}
		
		sort(top);
		sort(bot);
		merge(a, top, bot);
	}
	
	
	public void merge(int[] a, int[] top, int[] bot) {
		
		int top_index = 0;
		int bot_index = 0;
		int a_index = 0;
		
		while(top_index < top.length && bot_index < bot.length) {
			
			if(top[top_index] <= bot[bot_index]) {
				a[a_index++] = top[top_index++];
			}else {
				a[a_index++] = bot[bot_index++];
			}
			
		}
		while(top_index < top.length) {
			a[a_index++] = top[top_index++];
		}
		while(bot_index < bot.length) {
			a[a_index++] = bot[bot_index++];
		}
	}
}
