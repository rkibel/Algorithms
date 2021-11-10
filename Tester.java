public class Tester {
    public static void main (String[] args){
        int[][] arr = {{3, -5, 5, 1}, {0, 0, 3, 0}, {4, -4, -5, 6}, {5, 0, 2, 4}};
        //int[][]arr = {{0, 0}, {0, 0}};
        System.out.println(DeterminantCalculator.FindDeterminant(arr));
    }
}
