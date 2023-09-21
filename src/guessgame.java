import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) throws Exception {
    
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    boolean run = true;
    int guess = random.nextInt(20);
    int userGuesses = 0;

    System.out.println("Gissa nummret mellan 1-20!");
    System.out.println("Jag kommer räkna antal försök!");
        while (run){
            int guessUser = input.nextInt();

            userGuesses += 1;

            if (guessUser < guess){
                System.out.println("Gissa högre!");
                continue;
            }
            else if (guessUser > guess){
                System.out.println("Gissa lägre!");
                continue;
            }
            else if (guessUser == guess){
                System.out.println("Grattis du gissade rätt!");
                System.out.println("Det tog: " + userGuesses + " Försök");
                break;
            }
            else {
                System.out.println("Fel inmatning");
                continue;
            }

        }

        input.close();
    }
}
