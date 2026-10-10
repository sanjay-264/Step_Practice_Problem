package Week10;

import java.util.*;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double getAverage() {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }

    char getGrade() {
        double avg = getAverage();

        if (avg >= 75)
            return 'B';
        else if (avg >= 60)
            return 'C';
        else if (avg >= 40)
            return 'D';
        else
            return 'F';
    }
}

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int[] marks = new int[3];

            for (int j = 0; j < 3; j++)
                marks[j] = sc.nextInt();

            Student s = new Student(name, marks);

            System.out.printf("%s: Average %.1f, Grade %c%n",
                    s.name.toUpperCase(), s.getAverage(), s.getGrade());
        }
    }
}