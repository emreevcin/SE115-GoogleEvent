package Week_12;

/*
    Write a function that returns the position of a dropped object on earth’s gravity, as a function of time. Use meters and seconds as your units. Assume the start position is at 0 meters.
 */

public class Question1 {
    public static double calculatePosition(double timeInSeconds) {
        final double gravity = 9.81;
        double initialPosition = 0;
        double initialVelocity = 0;
        return initialPosition + (initialVelocity * timeInSeconds) + (0.5 * gravity * timeInSeconds * timeInSeconds);
    }

    public static void main(String[] args) {
        double time = 2.5;
        double position = calculatePosition(time);
        System.out.println("Position of the dropped object after " + time + " seconds: " + position + " meters");
    }
}
