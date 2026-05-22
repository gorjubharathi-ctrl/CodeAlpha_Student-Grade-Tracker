import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            int mark = sc.nextInt();
            marks.add(mark);
        }

        // Calculate total, highest, lowest
        int total = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);

        for (int mark : marks) {
            total += mark;

            if (mark > highest) {
                highest = mark;
            }
            if (mark < lowest) {
                lowest = mark;
            }
        }

        double average = (double) total / n;

        // Summary Report
        System.out.println("\n===== STUDENT GRADE REPORT =====");
        System.out.println("Total Students: " + n);
        System.out.println("Marks: " + marks);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}