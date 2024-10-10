import java.util.Random;
import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Input the number of random points to generate: ");
        int totalPoints = scanner.nextInt();
        int circlePoints = 0;

        for (int i = 0; i < totalPoints; i++) {
            double x = random.nextDouble() * 2 - 1;
            double y = random.nextDouble() * 2 - 1;

            if (x * x + y * y <= 1) {
                circlePoints++;
            }
        }
        double piEstimate = (double) circlePoints / totalPoints * 4;

        System.out.printf("The value of Pi after generating %d points: %.6f%n", totalPoints, piEstimate);

        scanner.close();
    }
}
