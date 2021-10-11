import java.util.Arrays;
public class Tester {
    public static void main (String[] args){
        int[] sample = new int[10];
        for (int i = 0; i < sample.length; i++){
            sample[i] = (int)(Math.random()*20);
        }
        QuickSort.quickSort(sample, 0, sample.length-1);
        System.out.println(Arrays.toString(sample));
    }
}
