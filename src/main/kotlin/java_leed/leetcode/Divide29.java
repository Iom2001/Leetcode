package java_leed.leetcode;

public class Divide29 {

    public static void main(String[] args) {
        System.out.printf(Integer.toString(divide(2147483647, -1)));
    }

    public static int divide(int dividend, int divisor) {
        long mDividend = dividend;
        long mDivider = divisor;
        mDividend = Math.abs(mDividend);
        mDivider = Math.abs(mDivider);
        long count = 0L;
        while (mDividend >= mDivider) {
            mDividend -= mDivider;
            count++;
        }
        if (dividend < 0 && divisor < 0) {
             if (count > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else return (int) count;
        } else if (dividend < 0 || divisor < 0) {
            if (count <= Integer.MAX_VALUE) return (int) -count;
            else return Integer.MIN_VALUE;
        }
        if (count > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else return (int) count;
    }
}
