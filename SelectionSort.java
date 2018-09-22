public class SelectionSort implements SortingAlgorithm {
	public static void main(String[] args){
		SelectionSort yo = new SelectionSort();
		int[] a = new int[]{20,2,4,12,63,8765,123,1,76533245,7898,34,12,7};
		yo.sort(a);
		for(int i= 0; i<a.length-1;i++){
			System.out.print(a[i] + ", ");
		}
	}
	public SelectionSort(){}
	public void swap(int a, int b, int[] arr){
		int temp = arr[a];
    	arr[a] = arr[b];
    	arr[b] = temp;
	}
	public void sort(int[] arr){
        for (int i= 0;i < arr.length-1;i++){
            int min_idx = i;
            for (int j= i+1;j < arr.length;j++){
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            swap(min_idx, i, arr);
        }
	}
}