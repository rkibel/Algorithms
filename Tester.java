public class Tester {
    public static void main (String[] args){
        int[][] arr = {
        {0, 2, -4}, 
        {-8, 2, 4}, 
        {-4, 2, 0} 
    };
        int eigenvalue = 4;
        int det = DeterminantCalculator.FindDeterminantWithEigenValue(arr, eigenvalue);
        if (det == 0)
            System.out.print("Yes, det = ");
        else
            System.out.print("No, det = ");
        System.out.println(det);
    }
}
