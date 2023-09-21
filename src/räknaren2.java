import java.util.Scanner;

public class räknaren2 {
    public static void main(String[] args) throws Exception {       
       Scanner input = new Scanner(System.in);

        int start = 0;
        boolean run = true;
            while (run){
                System.out.println("Nu ska vi leka, du får jobba upp dig till siffran fem och kan lägga till och ta bort!");
                System.out.println("Välj a för att lägga till 1, välj b för att ta bort en");
                System.out.println("Hej ditt nuvarande värde är: " + start);
                String choice = input.nextLine();

                switch(choice) {
                    case "a":
                        start++;
                        if (start == 5)
                            run = false;
                            System.out.println("Nu kom du till 5 och avslutas!");
                        break;

                    case "b":
                        start--;
                        if (start == -1)
                            start++;
                            System.out.println("inte under 0"); 
                        break;

                    default:
                        System.out.println("Skriv bara a eller b");
                        break;
                }
                }
        input.close();
    }
}