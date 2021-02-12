import java.util.Comparator;

public class sort<T extends Comparable<T>> {
	public sort() {
		super();
	}

	public void insertSort(T[] p) {
		int j;
		for (int i = 1; i < p.length; i++) {
			T temp = p[i];
			for (j = i-1; (j > -1) && (p[j].compareTo(temp)>0); --j) p[j+1] = p[j];
			p[j+1] = temp;
		}
	}

	public void insertSort(T[] p, int min, int max) {
		int j;
		for (int i = (min+1); i < (max+1); i++) {
			T temp = p[i];
			for (j = i-1; (j > min-1) && (p[j].compareTo(temp)>0); --j) p[j+1] = p[j];
			p[j+1] = temp;
		}
	}
	
	public void selectionSort(T[] p) {
		for (int i = 0; i < p.length; i++){
			int temp = i;
			T min = p[i];
			for (int j = i + 1; j < p.length; j++){
				if (p[temp].compareTo(p[j])>0) temp = j;
			}
		p[i] = p[temp];
		p[temp] = min;
		}
	}
	
	public void selectionSort(T[] p, int min, int max) {
		for (int i = min; i < (max+1); i++){
			int temp = i;
			T mini = p[i];
			for (int j = i + 1; j < (max+1); j++){
				if (p[temp].compareTo(p[j])>0) temp = j;
			}
		p[i] = p[temp];
		p[temp] = mini;
		}
	}

	public void bubleSort(T[] p) {
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length - i - 1; j++) {
				if ((p[j].compareTo(p[j+1]))>0) {
					T tmp = p[j];
					p[j] = p[j+1];
					p[j+1] = tmp;
				}	
			}
		}

	}

	public void bubleSort(T[] p, int min, int max) {
		for (int i = min; i < (max+1); i++) {
			for (int j = min; j < max; j++) {
				if ((p[j].compareTo(p[j+1]))>0) {
					T tmp = p[j];
					p[j] = p[j+1];
					p[j+1] = tmp;
				}	
			}
		}
	}

}
