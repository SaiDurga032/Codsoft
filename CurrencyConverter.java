import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double usdToInrRate = 74.5; // Example rate (replace with actual data)

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double amountUSD = scanner.nextDouble();

        // Convert to INR
        double amountINR = amountUSD * usdToInrRate;

        // Display result
        System.out.printf("%.2f USD is equivalent to %.2f INR%n", amountUSD, amountINR);
        scanner.close();
    }
}
