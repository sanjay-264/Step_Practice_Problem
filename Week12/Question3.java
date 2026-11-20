import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reads the entire comma-separated command sequence
        String input = sc.nextLine();
        String[] commands = input.split(",");

        // Stack of size 3 for returned books
        String[] pile = new String[3];
        int top = -1;

        // Circular queue of size 3 for borrowing students
        String[] line = new String[3];
        int front = 0;
        int rear = -1;
        int queueSize = 0;

        for (String rawCmd : commands) {
            String cmd = rawCmd.trim();
            if (cmd.isEmpty()) continue;

            if (cmd.startsWith("RETURN ")) {
                String book = cmd.substring(7).trim();
                if (top == 2) {
                    System.out.println(book + " rejected: pile is full");
                } else {
                    pile[++top] = book;
                    System.out.println(book + " placed on pile");
                }
            } else if (cmd.equals("SHELVE")) {
                if (top == -1) {
                    System.out.println("pile is empty");
                } else {
                    System.out.println("shelved " + pile[top--]);
                }
            } else if (cmd.startsWith("WAIT ")) {
                String student = cmd.substring(5).trim();
                if (queueSize == 3) {
                    System.out.println(student + " rejected: line is full");
                } else {
                    rear = (rear + 1) % 3;
                    line[rear] = student;
                    queueSize++;
                    System.out.println(student + " joined the line");
                }
            } else if (cmd.equals("SERVE")) {
                if (queueSize == 0) {
                    System.out.println("no one waiting");
                } else {
                    String servedStudent = line[front];
                    front = (front + 1) % 3;
                    queueSize--;
                    System.out.println("served " + servedStudent);
                }
            }
        }
        sc.close();
    }
}