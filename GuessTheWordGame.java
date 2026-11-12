import java.util.Scanner;
public class GuessTheWordGame {
    public static void main(String[] args) {

        System.out.println("GUESS THE WORD GAME");

        Scanner in = new Scanner(System.in);
        String word = "MATCHA";
        char[] guess = {'_', '_', '_', '_', '_', '_'};

        while (true) {
            for (int i = 0; i < guess.length; i++)
                System.out.print(guess[i] + " ");

            System.out.print("\n Guess the Word: ");
            char letter = in.nextLine().toUpperCase().charAt(0);
            System.out.println();

            boolean correct = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    guess[i] = letter;
                    correct = true;
                    
                }
            }

            if (!correct)
                System.out.println("Wrong! Try again!");
                System.out.println();

            if (new String(guess).equals(word))
                break;
        }

        System.out.println("Correct! The Answer is MATCHA");
        System.out.println("Thank you for playing!");

        in.close();
    }
}