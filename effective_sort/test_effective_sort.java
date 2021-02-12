import java.util.*;

public class test_effective_sort {
	public static void main (String[] args){
		sort bs = new sort();

		int size = 10;
		Integer[] mas0 = new Integer[size];
		System.out.println("unsorted:");
		for (int i = 0; i<size; i++){
			mas0[i] = (int)(Math.random()*20);
			System.out.print(mas0[i]+" ");
		}
		System.out.print('\n');

		System.out.println("quick sort[5:9]:");
		bs.quickSort(mas0,5,9);
		for (int i = 0; i<size; i++){
			System.out.print(mas0[i]+" ");
		}
		System.out.print('\n');

		System.out.println("quick sort:");
		bs.quickSort(mas0);
		for (int i = 0; i<size; i++){
			System.out.print(mas0[i]+" ");
		}
		System.out.print("\n\n\n");

		System.out.println("unsorted:");
		for (int i = 0; i<size; i++){
			mas0[i] = (int)(Math.random()*20);
			System.out.print(mas0[i]+" ");
		}
		System.out.print('\n');

		System.out.println("megre sort[5:9]:");
		bs.mergeSort(mas0,5,9);
		for (int i = 0; i<size; i++){
			System.out.print(mas0[i]+" ");
		}
		System.out.print('\n');

		System.out.println("merge sort:");

		bs.mergeSort(mas0);
		for (int i = 0; i<size; i++){
			System.out.print(mas0[i]+" ");
		}
		System.out.print("\n\n\n");

		System.out.println("unsorted:");
		for (int i = 0; i<size; i++){
			mas0[i] = (int)(Math.random()*20);
			System.out.print(mas0[i]+" ");
		}
		System.out.print('\n');

		System.out.println("heap sort[5:9]:");
		bs.heapSort(mas0,5,9);
		for (int i = 0; i<size; i++){
			System.out.print(mas0[i]+" ");
		}
		System.out.print('\n');

		System.out.println("heap sort:");

		bs.heapSort(mas0);
		for (int i = 0; i<size; i++){
			System.out.print(mas0[i]+" ");
		}
		System.out.print("\n\n\n");


	}
}
