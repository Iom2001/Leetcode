package java_leed.leetcode;

import java.sql.Array;

public class RemoveElement27 {

    public static void main(String[] args) {

//        removeElement(new Array(3,2,2,3), 3);
    }

    public static int removeElement(int[] nums, int val) {
        var count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                int len = nums.length - count - 1;
                for (int j = i; j < len; j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
                count++;
            }
        }
        return count;
    }
}
