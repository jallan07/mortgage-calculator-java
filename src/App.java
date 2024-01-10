import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public class Main {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Principal: ");
                int principal = scanner.nextInt();

                System.out.print("Annual Interest Rate: ");
                float annualInterest = scanner.nextFloat();

                System.out.print("Period (years): ");
                byte years = scanner.nextByte();

                double response = MortgageCalculator.calculatePayment(principal, annualInterest, years);

                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(response);
                System.out.println("Mortgage: " + mortgageFormatted);
            }
        }
    }
}
