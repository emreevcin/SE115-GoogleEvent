package Week_12;

/*
    Write a function that returns the position of a dropped object on earth’s gravity, as a function of time and start position. Use meters and seconds as your units.
 */

public class Question2 {
    public static double calculatePosition(double timeInSeconds, double initialPosition) {
        final double gravity = 9.81;
        double initialVelocity = 0;
        return initialPosition + (initialVelocity * timeInSeconds) + (0.5 * gravity * timeInSeconds * timeInSeconds);
    }

    public static void main(String[] args) {
        double time = 2.5;
        double initialPosition = 10;
        double position = calculatePosition(time, initialPosition);
        System.out.println("Position of the dropped object after " + time + " seconds, starting from " + initialPosition + " meters: " + position + " meters");
    }
}
