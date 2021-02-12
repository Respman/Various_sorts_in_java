import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
  
public class LinSort {
  
    public static void MSD(int[] source) {
        List<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        
        boolean flag = false;
        int tmp = -1, divisor = 1;
        while (!flag) {
            flag = true;
            for (Integer i : source) {
                tmp = i / divisor;
                buckets[tmp % 10].add(i);
                if (flag && tmp > 0) flag = false;
            }
          
            int a = 0;
            for (int b = 0; b < 10; b++) {
                for (Integer i : buckets[b]) {
                source[a++] = i;
                }
                buckets[b].clear();
            }
            divisor *= 10;
        }
    }//End MSD
    
    static void LSDsort(int[] arr){ 
        int n = arr.length;
        int m = getMax(arr, n); 
        
        for (int exp = 1; m/exp > 0; exp *= 10) 
            forSort(arr, n, exp); 
    } 

    static int getMax(int[] arr, int n){ 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  
    static void forSort(int[] arr, int n, int exp){ 
        int[] output = new int[n]; // output array 
        int i; 
        int[] count = new int[10]; 
        Arrays.fill(count,0); 
  
        for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 
  
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        for (i = n - 1; i >= 0; i--){ 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
  
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    }

    public static void countingSort( int[] source){
    
        int n = source.length;
        int min=0, max=0;
        for (int i = 1; i < n; i++){
            if (source[i] > max) max = source[i];
            if (source[i] < min) min = source[i];
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for (int i = 0; i < n; i++)
            count[source[i] - min]++;

        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];

        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                source[j++] = i + min;
    }//End countingSort
}
