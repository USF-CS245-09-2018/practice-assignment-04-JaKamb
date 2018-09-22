public class BubbleSort implements SortingAlgorithm {
	public void swap(int a, int b, int[] arr){
		int temp = arr[a];
    	arr[a] = arr[b];
    	arr[b] = temp;
	}
	public void sort(int[] arr){
		boolean swapped = true;
		int last = 0;
		while(swapped){
			swapped = false;
			for(int i=0;i<arr.length-1-last;i++){
				if(arr[i]>arr[i+1]){
					swap(i, i+1, arr);
					swapped = true;
				}
			}
			last++;
		}
	}
}