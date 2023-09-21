import java.util.Scanner;

public class Bondalizer_with_methods {
    public static void main(String[] args) throws Exception {

        System.out.println("Skriv ditt förnamn och efternamn i en metod!");
        System.out.println("Så skickar vi tillbaka den till main sen!");
        
        String firstName = fnamn();
        System.out.println(firstName);
   

    }

    public static String fnamn() {

        System.out.println("Börja med förnamn!");
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        System.out.println("Efternamn tack!");
        String last = input.nextLine();
        String fullname = ("Mitt namn är " + last+ ", " + first + " " + last);
        input.close();
        return  fullname;
    }

}
    

