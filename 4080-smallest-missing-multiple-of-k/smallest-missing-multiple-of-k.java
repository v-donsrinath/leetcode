 import java.util.*;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        // Store all numbers
        for (int num : nums) {
            set.add(num);
        }

        // Check multiples of k
        int multiple = k;

        while (set.contains(multiple)) {
            multiple += k;
        }

        return multiple;
    }
}
