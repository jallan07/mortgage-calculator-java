import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public class Main {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                final int MIN_LOAN_AMOUNT = 1_000;
                final int MAX_LOAN_AMOUNT = 1_000_000;
                final byte MIN_INTEREST_RATE = 0;
                final byte MAX_INTEREST_RATE = 30;
                final byte MIN_YEARS = 1;
                final byte MAX_YEARS = 30;

                int principal = 0;
                while (true) {
                    System.out.print("Principal: ");
                    principal = scanner.nextInt();
                    if (principal >= MIN_LOAN_AMOUNT && principal <= MAX_LOAN_AMOUNT) {
                        break;
                    }
                    System.out.println("Enter a number between 1,000 and 1,000,000");
                }

                float annualInterest;
                while (true) {
                    System.out.print("Annual Interest Rate: ");
                    annualInterest = scanner.nextFloat();
                    if (annualInterest > MIN_INTEREST_RATE && annualInterest <= MAX_INTEREST_RATE) {
                        break;
                    }
                    System.out.println("Enter a value greater than 0 and less than or equal to 30");
                }

                byte years;
                while (true) {
                    System.out.print("Period (years): ");
                    years = scanner.nextByte();
                    if (years >= MIN_YEARS && years <= MAX_YEARS) {
                        break;
                    }
                    System.out.println("Enter a value between 1 and 30");
                }

                double response = MortgageCalculator.calculatePayment(principal, annualInterest, years);

                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(response);
                System.out.println("Mortgage: " + mortgageFormatted);
            }
        }
    }
}
