package Week_12;

/*
    Recall that earth’s gravity is actually not constant but depends on the distance h to earth’s center with the formula g = GMearth/h2. G is the gravity constant 6.67×10−11m3/kgsec2. Mearth is The mass of Earth at 6 × 1024 kg. Instead of solving differential equations, we can numerically calculate the position of an object over time in small increments of t. At each increment you must recalculate g, based on the new position. Modify the function in question 3 to calculate g based on the start position, and then iteratively update it at each increment.
 */

public class Question4 {
    public static double calculatePosition(double timeInSeconds, double initialPosition, double initialVelocity) {
        final double gravityConstant = 6.67 * Math.pow(10, -11);
        final double massOfEarth = 6 * Math.pow(10, 24);
        double position = initialPosition;
        double velocity = initialVelocity;

        double deltaTime = 0.1;
        double currentTime = 0;

        while (currentTime < timeInSeconds) {
            double distanceToCenter = Math.abs(position); // Assuming position is the distance from the center
            double gravity = gravityConstant * massOfEarth / (distanceToCenter * distanceToCenter);
            double acceleration = gravity;

            velocity += acceleration * deltaTime;
            position += velocity * deltaTime;

            currentTime += deltaTime;
        }

        return position;
    }

    public static void main(String[] args) {
        double time = 2.5;
        double initialPosition = 10;
        double initialVelocity = 0;
        double position = calculatePosition(time, initialPosition, initialVelocity);
        System.out.println("Position of the dropped object after " + time + " seconds, starting from " + initialPosition + " meters with an initial velocity of " + initialVelocity + " m/s: " + position + " meters");
    }
}
