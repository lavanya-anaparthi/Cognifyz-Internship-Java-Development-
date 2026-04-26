import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        double[] grades = new double[numSubjects];
        double sum = 0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }
        double average = sum / numSubjects;
        System.out.println("Average Grade: " + average);
        if (average >= 90) System.out.println("Overall Grade: A");
        else if (average >= 80) System.out.println("Overall Grade: B");
        else if (average >= 70) System.out.println("Overall Grade: C");
        else if (average >= 60) System.out.println("Overall Grade: D");
        else System.out.println("Overall Grade: F");
        sc.close();
    }
}
