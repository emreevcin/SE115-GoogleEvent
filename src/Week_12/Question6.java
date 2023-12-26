package Week_12;

/*
Write the function that calculates the summation given below.
        𝑁𝑀
𝑓(𝑁,𝑀)= ∑∑(𝑖+𝑗)2
 */

public class Question6 {
    public static long calculateSummation(int N, int M) {
        long sum = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                sum += (long) (i + j) * (i + j);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int N = 3;
        int M = 4;

        long result = calculateSummation(N, M);
        System.out.println("Summation for N = " + N + " and M = " + M + " is: " + result);
    }
}
