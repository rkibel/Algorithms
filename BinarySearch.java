import javax.lang.model.util.ElementScanner14;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while (start != end){
            int midIndex = (start + end-1)/2;
            if (arr[midIndex] == target)
                return midIndex;
            else if (arr[midIndex] > target){
                end = midIndex - 1;
            }
            else
                start = midIndex + 1;
        }
        return -1;
    }
}
