import java.util.Scanner;

public class IT26101198Lab9Q4 {   
 
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.3) + (examMark * 0.7);
    }
  
    public static String findGrades(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
  
    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-10s %-12.2f %-5s%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            assignmentMarks[i] = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            examMarks[i] = input.nextDouble();

            
            finalMarks[i] = calcFinalMark(assignmentMarks[i], examMarks[i]);
            grades[i] = findGrades(finalMarks[i]);
            System.out.println();
        }
 
        System.out.println("Name      Final Mark   Grade");
  
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}
