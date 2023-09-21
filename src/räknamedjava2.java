import java.util.Scanner;

public class räknamedjava2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        boolean run = true;

        while (run){
            System.out.println("Hej, detta är en enkel miniräknare där du kommer ha 5 val");
            System.out.println("1. + 2. -  3. /  4. *  5. Avsluta");
            String choice = input.nextLine();

            switch (choice){
                case "1":
                    System.out.println("skriv första tal");
                    int plus1 = input.nextInt();
                    System.out.println("skriv andra tal");
                    int plus2 = input.nextInt();
                    int plusSum = plus1 + plus2;
                    System.out.println("Summan är: " + plus1 + " + " + plus2 + " = " + plusSum );
                    break;
                case "2":
                    System.out.println("skriv första tal");
                    int minus1 = input.nextInt();
                    System.out.println("skriv andra tal");
                    int minus2 = input.nextInt();
                    int minusSum = minus1 - minus2;
                    System.out.println("Summan är: " + minus1 + " - " + minus2 + " = " + minusSum );
                    break;
                case "3":
                    System.out.println("skriv första tal");
                    int div1 = input.nextInt();
                    System.out.println("skriv andra tal");
                    int div2 = input.nextInt();
                    int divSum = div1 / div2;
                    System.out.println("Summan är: " + div1 + " / " + div2 + " = " + divSum );
                    break;
                case "4":
                    System.out.println("skriv första tal");
                    int mult1 = input.nextInt();
                    System.out.println("skriv andra tal");
                    int mult2 = input.nextInt();
                    int multSum = mult1 * mult2;
                    System.out.println("Summan är: " + mult1 + " * " + mult2 + " = " + multSum );
                    break;
                case "5":
                    System.out.println("Detta är Avsluta");
                    run = false;
                    break;
                default:
                    System.out.println("Skriv in en giltlig siffra!");
                    break;           
            }
        }
        input.close();
    }
}