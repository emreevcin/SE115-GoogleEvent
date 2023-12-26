package Week_12;

/*
For a list of N elements, we can say that there are N(N-1)/2 combinations of two pairs. For example, for {1, 2, 3, 4} the pairs are (1, 2), (1, 3), (1, 4), (2, 3), (2, 4) and (3, 4). Write a method that prints such pairs for a given integer array L.
 */

public class Question9 {
    public static void main(String[] args) {
        int[] L = {1, 2, 3, 4};
        printPairs(L);
    }

    public static void printPairs(int[] L) {
        for (int i = 0; i < L.length; i++) {
            for (int j = i + 1; j < L.length; j++) {
                System.out.println("(" + L[i] + ", " + L[j] + ")");
            }
        }
    }
}
