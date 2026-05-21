import java.util.Arrays;

public class treeSumCloset {

    static int threeSumClosest(int[] nums, int target) {

        int sum = 0;

        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(closestSum - target);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                sum = nums[i] + nums[left] + nums[right];

                int diff = Math.abs(sum - target);

                if (diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }

                if (sum == target) {
                    return sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

        }

        return closestSum;

    }

    public static void main(String[] agrs) {

        // int nums[] = { -1, 2, 1, -4 };
        // int target = 1;

        // int nums[] = { 0, 0, 0 };
        // int target = 0;

        // int nums[] = { 4, 0, 5, -5, 3, 3, 0, -4, -5 };
        // int target = -2;

        // int nums[] = { 0, 3, 97, 102, 200 };
        // int target = 300;

        int nums[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int target = 1;

        System.out.println(threeSumClosest(nums, target) + " ");

    }
}
