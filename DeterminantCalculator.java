
public class DeterminantCalculator {
    public static int FindDeterminant(int[][]arr){
        if (arr.length != arr[0].length)
            return Integer.MAX_VALUE;
        if (arr.length == 2)
            return arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
        
        int len = arr.length;
        int[][] cofactor = new int[len-1][len-1];
        int output = 0;
        for (int j = 0; j < arr[0].length; j++){
            int lastcol = 0;
            for (int a = 1; a < len; a++){
                for (int b = 0; b < len; b++){
                    if (b == j)
                        continue;
                    cofactor[a-1][lastcol] = arr[a][b];
                    lastcol++;
                }
            }
            if (arr[0][j] != 0)
                output += arr[0][j] * Math.pow(-1, j) * FindDeterminant(cofactor);
        }
        return output;
    }
}