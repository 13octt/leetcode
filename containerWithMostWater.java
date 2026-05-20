public class containerWithMostWater {

    static int maxArea(int[] height) {

        int maxArea = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left; //
            int minHeight = Math.min(height[left], height[right]);

            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] agrs) {

        int[] height = { 1, 8, 6 }; // = 6

        // int[] height = { 1, 1 };

        // int[] height = { 1, 2, 1 };

        // int[] height = { 1, 2 };

        // int[] height = { 0, 2 };

        System.out.println("Max Area: " + maxArea(height) + "  ");

    }
}
