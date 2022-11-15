package java_leed.array;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

    }

    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 1};
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int requireValue = target - nums[i];
            if (map.containsKey(requireValue) && map.get(requireValue) != i) {
                return new int[]{map.get(requireValue), i};
            }
        }
        return null;
    }
}
