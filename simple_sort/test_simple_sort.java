import java.util.*;

public class test_simple_sort {
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

		System.out.println("buble sort[5:9]:");
		bs.bubleSort(mas0,5,9);
		for (int i = 0; i<size; i++){
			System.out.print(mas0[i]+" ");
		}
		System.out.print('\n');

		System.out.println("buble sort:");
		bs.bubleSort(mas0);
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

		System.out.println("selection sort[5:9]:");
		bs.selectionSort(mas0,5,9);
		for (int i = 0; i<size; i++){
			System.out.print(mas0[i]+" ");
		}
		System.out.print('\n');

		System.out.println("selection sort:");

		bs.selectionSort(mas0);
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

		System.out.println("insert sort[5:9]:");
		bs.insertSort(mas0,5,9);
		for (int i = 0; i<size; i++){
			System.out.print(mas0[i]+" ");
		}
		System.out.print('\n');

		System.out.println("insert sort:");

		bs.insertSort(mas0);
		for (int i = 0; i<size; i++){
			System.out.print(mas0[i]+" ");
		}
		System.out.print("\n\n\n");
	}
}
