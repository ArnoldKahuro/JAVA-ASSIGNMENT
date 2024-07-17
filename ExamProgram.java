import java.util.Scanner;

public class ExamProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int courseworkCount = countCourseworkAssessments(); // Count coursework assessments
        boolean repeatCoursework = needsRepeatCoursework(courseworkCount); // Check if coursework completion is sufficient
        
        int finalExamGrade = 0; // Placeholder for final exam grade (assume out of 100)
        int totalScore = calculateTotalScore(finalExamGrade); // Calculate total score
        
        int choice;
        do {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. View coursework results");
            System.out.println("2. View exam results");
            System.out.println("3. Exit the program");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            // Handle user's choice
            switch (choice) {
                case 1:
                    System.out.println("Number of coursework assessments done: " + courseworkCount);
                    break;
                case 2:
                    System.out.println("Final Exam Grade: " + finalExamGrade);
                    System.out.println("Total Score: " + totalScore);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
            }
        } while (choice != 3); // Exit loop when user chooses option 3
    }

    // Function to count coursework assessments in DIT409 unit
    public static int countCourseworkAssessments() {
        int courseworkCount = 0;
        // Assume 5 assessments are done
        for (int i = 1; i <= 5; i++) {
            // Simulating some condition where coursework is counted
            courseworkCount++;
        }
        return courseworkCount;
    }

    // Function to determine if student needs to repeat coursework
    public static boolean needsRepeatCoursework(int courseworkCount) {
        // Check if at least 2/3 of coursework is completed
        double twoThirds = 2.0 / 3.0;
        if (courseworkCount >= twoThirds * 5) { // Assuming 5 total assessments
            return false; // Sufficient coursework completed
        } else {
            return true; // Need to repeat coursework
        }
    }

    // Function to calculate total score (final exam + coursework)
    public static int calculateTotalScore(int finalExamGrade) {
        // Assuming coursework contributes 50% and final exam contributes 50%
        int courseworkScore = 0; // Placeholder for coursework score
        int totalScore = (int) (0.5 * courseworkScore + 0.5 * finalExamGrade);
        return totalScore;
    }
}
