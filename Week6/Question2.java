public class Question2 {    
    static class MessWallet{
        private double balance;

        MessWallet(double b) {
            balance = b;
        }

        void topUp(double amount) {
            balance += amount;
        }

        void deduct(double amount) {
            if(balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }

        double getBalance() {
            return balance;
        }
    }
    public static void main(String[] args) {
        MessWallet wallet1 = new MessWallet(1000.0);
        System.out.println("Initial balance: " + wallet1.getBalance());
        wallet1.topUp(500.0);
        System.out.println("Balance after top-up: " + wallet1.getBalance());
        wallet1.deduct(200.0);
        System.out.println("Balance after deduction: " + wallet1.getBalance());
    }
}