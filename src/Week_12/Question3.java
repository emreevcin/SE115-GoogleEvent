package Week_12;

/*
    Write a function that returns the position of a dropped object in a gravity field, as a function of gravity g, time and start position, and initial velocity. Use meters and seconds as your units. You will recall that the formula for the position as h= h0 + t*v0 - gt2/2. Define a constant g for earth’s gravity as 9.8 meter/sec2 to be used as the default value.
 */

public class Question3 {
    public static double calculatePosition(double timeInSeconds, double initialPosition, double initialVelocity) {
        final double gravity = 9.8;
        return initialPosition + (timeInSeconds * initialVelocity) - (0.5 * gravity * timeInSeconds * timeInSeconds);
    }

    public static void main(String[] args) {
        double time = 2.5;
        double initialPosition = 10;
        double initialVelocity = 0;
        double position = calculatePosition(time, initialPosition, initialVelocity);
        System.out.println("Position of the dropped object after " + time + " seconds, starting from " + initialPosition + " meters with an initial velocity of " + initialVelocity + " m/s: " + position + " meters");
    }
}
