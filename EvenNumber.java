import java.util.Scanner;

public class EvenNumber {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public void printEven(boolean isEven) {
        if (isEven) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public static void main(String[] args) {
        EvenNumber checker = new EvenNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();
        boolean result = checker.isEven(number);
        checker.printEven(result);
    }
}
