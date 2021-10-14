import java.util.Arrays;
public class Tester {
    public static void main (String[] args){
        /*int[] sample = new int[10];
        for (int i = 0; i < sample.length; i++){
            sample[i] = (int)(Math.random()*20);
        }
        QuickSort.quickSort(sample, 0, sample.length-1);
        System.out.println(Arrays.toString(sample));
        */
        ArraySpiral a = new ArraySpiral();
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(a.spiral(arr).toString());
    }
}
