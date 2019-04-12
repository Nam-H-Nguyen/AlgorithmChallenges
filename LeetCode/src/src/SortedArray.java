public class SortedArray {
    public int removeDuplicates(int[] nums) {
        // iterate over the sorted array
        // check if current element is equal to the next current element
        // if the same, remove the current element
        // else keep incrementing
        // return the length of the array

        // If array has 0 or 1 element, there are no duplicates
        if (nums.length <= 1) {
            return nums.length;
        }

        return 0;
    }
}
