public class Palindrome {
    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Palindrome checker = new Palindrome();
        String testString = "radar";
        System.out.println("Is palindrome: " + checker.isPalindrome(testString));
    }
}
