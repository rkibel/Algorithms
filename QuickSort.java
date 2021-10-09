class QuickSort{
    void quickSort (int[]nums, int first, int last){
        int pivot, i, j, temp;
        if (first < last){
            pivot = first;
            i = first;
            j = last;
            while (i < j){
                while (nums[pivot] >= nums[i] && i < last)
                    i++;
                while (nums[j] > nums[pivot])
                    j--;
                if (i < j){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }        
            }
            temp = nums[pivot];
            nums[pivot] = nums[j];
            nums[j] = temp;
            quickSort(nums, first, j-1);
            quickSort(nums, j+1, last);
        }
    }
}