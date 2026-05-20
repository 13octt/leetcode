import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeSum {

    static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> myNumbers = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                // if (nums[left] == nums[left - 1])
                // continue;
                if (sum == 0) {
                    List<Integer> newList = new ArrayList<>();
                    newList.add(nums[i]);
                    newList.add(nums[left]);
                    newList.add(nums[right]);
                    myNumbers.add(newList);

                    // skip duplicates
                    while (left < right &&
                            nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right &&
                            nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else
                    right--;
            }
        }

        return myNumbers;
    }

    public static void main(String[] agrs) {

        // int[] nums = { -1, 0, 1 };
        // int[] nums = { -1, 0, 1, 2, -1, -4 };
        int[] nums = { 1, 2, 0, 1, 0, 0, 0, 0 };

        List<List<Integer>> myNumbers = threeSum(nums);
        System.out.println(myNumbers);
    }

}
