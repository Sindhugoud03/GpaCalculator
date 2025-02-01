import java.util.Scanner;

public class TotalMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();

        int totalMarks = 0;
        int maxMarks = 100;
       
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        
        int totalMaxMarks = subjects * maxMarks;

       
        float percentage = ((float) totalMarks / totalMaxMarks) * 100;

        
        System.out.println("\nResults:");
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Maximum Marks: " + totalMaxMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        scanner.close();
    }
}

