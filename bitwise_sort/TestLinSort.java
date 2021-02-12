class TestLinSort{
    public static void main(String[] args) {
        int[] num = {170, 45, 75, 90, 802, 2, 24, 66,23,234,3,232,44};
        System.out.print("Source:\t\t"); 
        for (int n : num)
            System.out.print(n + " ");

        LinSort.MSD(num);
        System.out.print("\nMSD:\t\t");
        for (int h : num)
            System.out.print(h + " ");
        System.out.println();
        
        int[] num2 = {170, 45, 75, 90, 802, 2, 24, 66,23,234,3,232,44};
        LinSort.LSDsort(num2);
        System.out.print("LSD:\t\t");
        for (int k : num2)
            System.out.print(k + " ");
        System.out.println();
        
        int[] num3 = {170, 45, 75, 90, 802, 2, 24, 66,23,234,3,232,44};
        LinSort.countingSort(num3);
        System.out.print("counting:\t");
        for (int k : num3)
            System.out.print(k + " ");
        System.out.println();
    }

}
