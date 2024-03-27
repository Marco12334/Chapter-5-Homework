public class ReverseString {
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        ReverseString reverser = new ReverseString();
        String originalString = "hello";
        String reversedString = reverser.reverseString(originalString);
        System.out.println("Reversed string: " + reversedString);
    }
}
