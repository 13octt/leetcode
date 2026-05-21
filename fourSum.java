import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {

    static List<List<Integer>> fourSum(int[] nums, int target) {

        int fourSum = 0;

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            int l1 = i + 1;
            int l2 = i + 2;
            int r = nums.length - 1;

            while (l1 < r) {
                while (l2 < r) {
                    fourSum = nums[i] + nums[l1] + nums[l2] + nums[r];

                    if (fourSum == target) {
                        List<Integer> newList = new ArrayList<>();
                        newList.add(i);
                        newList.add(l1);
                        newList.add(l2);
                        newList.add(r);
                        result.add(newList);
                    } else if (fourSum < target) {
                        l2++;
                    } else {
                        r--;
                    }
                }
                l1++;
            }
        }

        return result;

    }

    public static void main(String[] agrs) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };

        System.out.println(fourSum(nums, 0));

    }
}
