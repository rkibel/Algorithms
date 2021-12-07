import java.util.Arrays;
public class Tester {
    public static void main (String[] args){
        double[][] arr = {
        {3, 1, 0}, 
        {1, 0, 1}  
        };
        double[][] res = MatrixManipulations.orthonormalSet(arr);
        for (double[] i : res){
            System.out.println(Arrays.toString(i));
        }
    }
}
