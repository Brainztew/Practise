import java.util.Scanner;

public class meny{
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("Vad vill du jag ska göra: ");
            System.out.println("a = Säg hej!. B = Säg HejDå!. C = Avsluta.");
            String choice = input.nextLine();

            switch(choice) {
                case "a":
                    System.out.println("Hej på dig kul att se dig :");
                    break;
                case "b":
                    System.out.println("Nämen hejdå vi ses snart igen");
                    break;
                case "c":
                    System.out.println("Nu avslutar vi detta!");
                    run = false;
                    break;

                default:
                    System.out.println("Skriv bara a, b eller c.");
                    break;
            }

        }
        
        input.close();
    }
}
