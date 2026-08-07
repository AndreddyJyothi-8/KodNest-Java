
import java.util.Scanner;

public class InputWithCondAndLoops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        int practiceDays = scanner.nextInt();
        int totalProblems = 0;

        // Read problems solved each day and calculate total
        for (int i = 1; i <= practiceDays; i++) {
            int solvedProblems = scanner.nextInt();
            totalProblems += solvedProblems;
        }

        // Display total and status
        System.out.println("Total solved: " + totalProblems);

        if (totalProblems >= 20) {
            System.out.println("Status: Strong progress");
        } else if (totalProblems >= 10 && totalProblems <= 19) {
            System.out.println("Status: Keep improving");
        } else {
            System.out.println("Status: Needs more practice");
        }

        scanner.close();
    }
}
