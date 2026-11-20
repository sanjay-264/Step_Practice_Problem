import java.util.Scanner;

interface PaymentMode {
    double processPayment(double amount);
}

class CashPayment implements PaymentMode {
    @Override
    public double processPayment(double amount) {
        return amount;
    }
}

class CardPayment implements PaymentMode {
    @Override
    public double processPayment(double amount) {
        return amount + (amount * 0.02);
    }
}

class UpiPayment implements PaymentMode {
    @Override
    public double processPayment(double amount) {
        return amount;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PaymentMode[] modes = new PaymentMode[n];
        String[] modeNames = new String[n];
        double[] amounts = new double[n];

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            double amount = sc.nextDouble();
            modeNames[i] = mode;
            amounts[i] = amount;

            if (mode.equalsIgnoreCase("Cash")) {
                modes[i] = new CashPayment();
            } else if (mode.equalsIgnoreCase("Card")) {
                modes[i] = new CardPayment();
            } else if (mode.equalsIgnoreCase("UPI")) {
                modes[i] = new UpiPayment();
            }
        }

        double totalProcessed = 0.0;
        for (int i = 0; i < n; i++) {
            double processed = modes[i].processPayment(amounts[i]);
            double fee = processed - amounts[i];
            totalProcessed += processed;

            System.out.printf("%s: amount %.1f, fee %.1f, processed %.1f%n",
                    modeNames[i], amounts[i], fee, processed);
        }

        System.out.printf("Total Amount Processed: %.1f%n", totalProcessed);
        sc.close();
    }
}