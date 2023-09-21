public class loopar {
    public static void main(String[] args) throws Exception {
/*         System.out.println("hello world");

        for (int i = 0; i < 10; i++) {
            System.out.println("I är nu " + i);
        } 

        String[] food = {"Hamburgare", "pizza", "Sushi"};

        for (String courses : food) {
        System.out.println("Jag tycker om: " + courses);  */
    
        int i = 3;
        while (i<10) {
            System.out.println("I är nu " + i);
            i++;
        }
        
        int x = 3;
        do {
            System.out.println("X är nu " + x);
            x++;

        } while (x < 10);
    }
}