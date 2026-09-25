package Week7;

public class Question1 {
    private final String id;
    private double savings;

    public Question1(String id) {
        this.id = id;
        this.savings = 0.0;
    }

    void deposit(double amount) {
            savings+=amount;
            System.out.println("Deposited: "+amount);
        }

    void withdraw(double amount) {
        if(amount<=savings) {
            savings-=amount;
            System.out.println("Withdrawn: "+amount);
        }
        else
            System.out.println("Insufficient funds");
    }   

    double getSavings() {
        return savings;
    }

    public static void main(String[] args){
        Question1 pb=new Question1("PB-1");
        pb.deposit(100);
        pb.withdraw(30);
        pb.withdraw(500);

        System.out.println("Savings: "+pb.getSavings());
    }
}