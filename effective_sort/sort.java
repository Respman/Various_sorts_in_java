import java.util.Comparator;

public class sort<T extends Comparable<T>> {
	public sort() {
		super();
	}

	public void heap(T[] array,int low, int root, int bottom){
		int maxchild;
		int done = 0;

		while (((root*2+1+low) <= bottom) &&(done == 0)){
			if ((root*2+1+low) == bottom){
				maxchild = root*2+1+low;
			} else if (array[root*2+1+low].compareTo(array[root*2+2+low])>0){
				maxchild = root*2+1+low;
			} else {
				maxchild = root*2+2+low;
			}

			if (array[root+low].compareTo(array[maxchild])<0){
				T temp = array[root+low];
				array[root+low] = array[maxchild];
				array[maxchild] = temp;
				root = maxchild - low;
			} else {
				done = 1;
			}
		}
	}

	public void heapSort(T[] array, int low, int high){
		for (int i = (((high-low+1) / 2) - 1); i >= 0; i--){
			heap(array, low, i, high);
		}

		for (int i = high; i >= (low+1); i--){

			T temp = array[low];
			array[low] = array[i];
			array[i] = temp;
			heap(array, low, 0, (i-1));
		}
	}

	public void heapSort(T[] array){
		heapSort(array, 0, array.length-1);
	}

	public void mergeSort(T[] array){
		mergeSort(array, 0, array.length - 1);
	}

	public void mergeSort(T[] array, int low, int high){
		if (high <= low)
			return;
	
		int mid = low + (high - low)/2;
		mergeSort(array, low, mid);
		mergeSort(array, mid + 1, high);

		T[] buf = (T[]) new Comparable[array.length];
		for (int i = 0; i<array.length; i++){
			buf[i] = array[i];
		}

		int i = low;
		int j = mid + 1;
		for (int k = low; k <= high; k++){
			if (i > mid) {
				array[k] = buf[j];
				j++;
			} else if (j > high) {
				array[k] = buf[i];
				i++;
			} else if (buf[j].compareTo(buf[i])<0) {
				array[k] = buf[j];
				j++;
			} else {
				array[k] = buf[i];
				i++;
			}
		}
	}

	public void quickSort(T[] array) {
		quickSort(array, 0, array.length - 1);
	}

	public void quickSort(T[] array, int low, int high){
		if (array.length == 0) 
			return;
		if (low >= high)
			return;
		
		int middle = low + (high - low)/2;
		T opora = array[middle];

		int i = low;
		int j = high;
		while (i <= j){
			while (array[i].compareTo(opora)<0) {
				i++;
			}
			while (array[j].compareTo(opora)>0) {
				j--;
			}
			if (i <= j) {
				T temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}

		if (low < j)
			quickSort(array, low, j);

		if (high > i)
			quickSort(array, i, high);
	}

}
