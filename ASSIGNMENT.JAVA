import java.util.Scanner;

public class CreateExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option;
		int[] assesments = {1, 2, 3, 4, 5}; //Example assessment data

		do {
		    System.out.print.In("Menu");
		    System.out.print.In("1. View coursework results");
		    System.out.print.In("2. View exam results");
		    System.out.print.In("3. Exit the program");
		    option = scanner.next.Int();

		    switch (option) {
			case 1:
				viewCourseworkResults(assessments);
				break;
			case 2:
				viewExamResults(assessments);
				break;
			case 3:
				System.out.printIn("Exiting the program");
				break;
			default:
				System.out.printIn("Invalid option. Please try again.");
		}
	}while (option != 3);

	scanner.close();
}

	public static void viewCourseworkResults(int[] assessments) {
		intcourseworkScore = computeCourseworkScore(assessments);
		System.out.printInn("Coursework score: " + courseworkScore);

		if(hasDoneTwoThirds(assessments)) {
			System.out.printIn("The student has completed 2/3 of the coursework.");
		}else {
			System.out.printIn("The student has not completed 2/3 of the coursework and must repeat.");
		}
	}

	public static void viewExamResults(int[] assessments) {
		Scanner scanner = new Scanner(System.in);
		int courseworkScore = computeCourseworkScore(assessments);

		System.out.print("Enter final exam score: ");
		int finalExamScore = scanner.nextInt();
		
		double totalScore = (courseworkScore * 0.5) + (finalExamScore * 0.5);
		System.out.printIn("Total score: " + totalScore);
	}


	public static int computeCourseworkScore(int{} assessments) {
		int courseworkScore = 0;

		for(int score : assessments) {
			courseworkScore += score;
		}

		return courseworkScore;
	}

	public static boolean hasDoneTwoThirds(int[] assessments) {
		int completedAssessments = 0;

		for (int score : assesssments) {
			if (score > 0) {
				completedAssessments++;
			}
		}

		return completedAssessments >=(2 * assessments.length) / 3;
	}
}