import java.util.Arrays;
public class Tester {
    public static void main (String[] args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 31, 42, 63};
        System.out.println(LinearSearch.linearSearch(arr, 42));
        System.out.println(BinarySearch.binarySearch(arr, 42));
    }
}
