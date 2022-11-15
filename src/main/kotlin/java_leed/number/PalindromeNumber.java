package java_leed.number;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("isPalindrome(121) = " + isPalindrome(121));
        System.out.println("isPalindrome(-121) = " + isPalindrome(-121));
        System.out.println("isPalindrome(10) = " + isPalindrome(10));
        System.out.println(isPalindrome(100001));
    }

    public static boolean isPalindrome(int x) {
        int firstValue = x;
        int secondValue = 0;
        int helperValue;
        while (firstValue > 0) {
            helperValue = firstValue;
            firstValue = firstValue / 10;
            secondValue = (secondValue * 10) + (helperValue - firstValue * 10);
        }
        return secondValue == x;
    }

    public static boolean isPalindrome2(int x) {
        int firstValue = x;
        int secondValue = 0;
        while (firstValue > 0) {
            secondValue = firstValue % 10 + secondValue * 10;
            firstValue /= 10;
        }
        return secondValue == x;
    }
}
