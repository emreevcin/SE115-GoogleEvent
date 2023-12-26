package Week_11;

/*
 Question: Write a function that accepts two integer values as parameters and returns the larger integer
value.
 */

public class Question1 {
    public static void main(String[] args) {
        System.out.println(larger(10, 20));
    }

    public static int larger(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
