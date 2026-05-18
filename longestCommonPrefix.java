import java.util.Arrays;

public class longestCommonPrefix {

    static String longestPrefix(String[] arr) {

        Arrays.sort(arr);

        System.out.println(arr);

        // Get the first and last strings after sorting
        String first = arr[0];
        String last = arr[arr.length - 1];
        int minLength = Math.min(first.length(),
                last.length());

        // Find the common prefix between the first
        // and last strings
        int i = 0;
        while (i < minLength &&
                first.charAt(i) == last.charAt(i)) {
            i++;
        }

        // Return the common prefix
        return first.substring(0, i);
    }

    public static void main(String[] agrs) {

        String[] strs = { "abc", "ab", "abcd" };

        System.out.println(longestPrefix(strs));

    }
}
