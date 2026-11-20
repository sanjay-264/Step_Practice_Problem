import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int roomsBilled = 0;
        int blockTotal = 0;

        for (int i = 0; i < n; i++) {
            String room = sc.next();
            int units = sc.nextInt();

            if (units < 0) {
                System.out.println(room + ": invalid reading");
            } else {
                int bill = 50; // Fixed meter charge
                if (units <= 100) {
                    bill += units * 3;
                } else if (units <= 200) {
                    bill += (100 * 3) + ((units - 100) * 5);
                } else {
                    bill += (100 * 3) + (100 * 5) + ((units - 200) * 8);
                }

                roomsBilled++;
                blockTotal += bill;
                System.out.println(room + ": " + units + " units, bill " + bill);
            }
        }

        System.out.println("Rooms billed " + roomsBilled + ", total " + blockTotal);
        sc.close();
    }
}