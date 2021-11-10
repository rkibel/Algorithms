import java.util.*;
public class ArraySpiral {
    public static List<Integer> spiral (int[][]arr){
        List<Integer> output = new ArrayList<>();
        int i = 0, j = 0, imin = 0, imax = arr.length-1, jmin = 0, jmax = arr[0].length-1;
        for (int index = 0; index < i*j; index++){
            if (i == imin && j == jmin){    
                while (j <= jmax){
                    output.add(arr[i][j]);
                    j++;
                }
                imin++;
            }
            else if (i == imin && j == jmax){
                while (i <= imax){
                    output.add(arr[i][j]);
                    i++;
                }
                jmax--;
            }
            else if (i == imax && j == jmax){
                while (j <= jmin){
                    output.add(arr[i][j]);
                    j--;
                }
                imax--;
            }
            else { //if i == imax && j == jmin
                while (i >= imin){
                    output.add(arr[i][j]);
                    i--;
                }
                jmin++;
            }
        }
        return output;
    }
    public static void main(String[] args){
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(spiral(arr).toString());
    }
}
/*
[1, 2, 3, 4],
[5, 6, 7, 8],
[9, 10, 11, 12],
[13, 14, 15, 16]
*/
