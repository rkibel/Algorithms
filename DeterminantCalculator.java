public class DeterminantCalculator {
    public static double FindDeterminant(double[][]arr){
        int len = arr.length;
        int wid = arr[0].length;
        //if it is not a square matrix throw error
        if (len != wid)
            return Integer.MAX_VALUE;

        //2x2 matrix case: calculate determinant using known formula
        if (len == 2)
            return arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
        
        //declare matrix of minors
        double[][] minors = new double[len-1][wid-1];

        //initialize output value
        double output = 0;

        //compute determinant using cofactor expansion along the first row
        for (int j = 0; j < arr[0].length; j++){
            
            //initialize matrix of minors to any [0][j] value
            int lastcol = 0;
            for (int a = 1; a < len; a++){
                for (int b = 0; b < len; b++){
                    if (b != j){
                        minors[a-1][lastcol++] = arr[a][b];
                    }
                }
                lastcol = 0;
            }

            //run recursion to find determinants of smaller matrices (if [0][j] value is 0 then ignore)
            if (arr[0][j] != 0)
                output += arr[0][j] * Math.pow(-1, j) * FindDeterminant(minors);
        }
        return output;
    }
    public static double[][] simplifyMatrix(double[][]arr){
        double [][] output = new double[arr.length][arr[0].length];
        
        return output;
    }
    public static double FindDeterminantWithEigenValue(double[][]arr, double eigenvalue){
        for (int i = 0; i < arr.length; i++){
            arr[i][i] -= eigenvalue;
        }
        return FindDeterminant(arr);
    }
}