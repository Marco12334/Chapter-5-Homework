import java.util.Scanner;

public class GameScores {
    public String getName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String getScore() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void printScore(String name, String score) {
        System.out.println(name + "'s high score: " + score);
    }

    public static void main(String[] args) {
        GameScores game = new GameScores();
        while (true) {
            System.out.println("Enter name: ");
            String name = game.getName();
            if (name.isEmpty()) break;
            System.out.println("Enter high score: ");
            String score = game.getScore();
            game.printScore(name, score);
        }
    }
}
