import java.util.Scanner;

public class räknare {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);


        int start = 0;
        System.out.println("Hej ditt nuvarande värde är: " + start);

        while (start<10000) {
            
            System.out.println("Hur mycket vill du öka?");
            int nummer = input.nextInt();
            start = nummer + start;   
            System.out.println("Nu är summan: " + start);
        
        }

        input.close();
    
    }
}