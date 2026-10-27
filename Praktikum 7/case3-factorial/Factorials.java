
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String keepGoing = "y";

        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();

            try {
                System.out.println("Factorial(" + val + ") = "
                        + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                System.out.println("Tidak dapat menghitung: "
                        + e.getMessage());
            }

            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }

        scan.close();
    }
}
