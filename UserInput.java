import java.util.Scanner;

public class UserInput {
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void printString(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        UserInput input = new UserInput();
        System.out.println("Please enter a string:");
        String userString = input.getInput();
        input.printString(userString);
    }
}
