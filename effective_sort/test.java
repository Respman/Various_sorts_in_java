import java.io.*;
import java.util.*;

public class test {
	public test() {
		super();
	}

	public static void main(String args[]) throws Exception{			
			FileInputStream fis = new FileInputStream("my.cfg");
			Properties cfg = new Properties();
			cfg.load(fis);
			Integer n = Integer.parseInt(cfg.getProperty("A"));
			Integer start = Integer.parseInt(cfg.getProperty("Start"));
			Integer end = Integer.parseInt(cfg.getProperty("Stop"));
			
			ball[] balls = new ball[n];
			sort bs = new sort();

			for (int i = 0; i < n; i++){
				balls[i] = new ball((int)(Math.random()*20),"A");
				System.out.println(balls[i]);
			}
			bs.heapSort(balls, start, end);
			
			System.out.println("\nSorted balls:\n");
				
			for (int i = 0; i < n; i++){
				System.out.println(balls[i]);
			}

			fis.close();
	}
}
	
