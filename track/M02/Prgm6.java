
public class Prgm6 {

    public static void main(String[] args) {
        int roundCode = 5;
        int attemptsUsed = 2;
        int maxAttempts = 3;

        String currentRound = "";

        switch (roundCode) {
            case 1:
                currentRound = "Aptitude Round";
                break;
            case 2:
                currentRound = "Technical Round";
                break;
            case 3:
                currentRound = "HR Round";
                break;
            case 4:
            case 5:
                currentRound = "Final Review";
                break;
            default:
                currentRound = "Invalid Round";
        }

        String attemptStatus = attemptsUsed < maxAttempts
                ? "Attempt Available"
                : "Attempt Limit Reached";

        System.out.println("Current Round: " + currentRound);
        System.out.println("Attempt Status: " + attemptStatus);
    }
}
