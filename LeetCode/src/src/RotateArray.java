import java.util.ArrayList;
import java.util.List;

public class RotateArray {
    public static void rotate(int[] nums, int k) {

        List<Integer> numsList = new ArrayList<>();

        for (int i = k+1; i < nums.length; i++) {
            numsList.add(nums[i]);
        }

        for (int i = 0; i < nums.length-k; i++) {
            numsList.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsList.get(i);
        }

    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }
}
