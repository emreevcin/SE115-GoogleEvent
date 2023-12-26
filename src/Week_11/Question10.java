package Week_11;

/*
    Question: Consider the following summation:
𝑆= 1/2 − 2/3 + 3/4 − 4/5 +···
Write a function that returns the sum of the first N number of terms.
 */

public class Question10 {
public static void main(String[] args) {
        System.out.println(summation(10));
    }

    public static double summation(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Odd
                sum += (double) i / (i + 1);
            } else { // Even
                sum -= (double) i / (i + 1);
            }
        }
        return sum;
    }
}
