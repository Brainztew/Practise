import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    
        Random random = new Random();


        System.out.println("Hur många tärningar vill du ha?");
        int dice = input.nextInt();

        System.out.println("Skriv hur många sidor du vill ha på din tärning:");
        int diceSide = input.nextInt();

        System.out.println("Du har valt " + diceSide + " sidor");
        System.out.println("Du har valt " + dice + " stycken träningar");
        System.out.println("Du slog detta med dina tärningar:");
        

        for(int i=0;i < dice; i++)
        {
            System.out.println(random.nextInt(diceSide)+1);
        }
        input.close();
    
    }

    }


