package Week_12;

/*
Write a method that takes two sorted lists and returns a merged sorted list. The pseudocode is given below.
INPUT: Sorted list A, Sorted list B OUTPUT: Merged list C
STEPS:
Create a counter for each A, B and C lists; ACtr, BCtr, and CCtr
Initialize the counters to 0
While CCtr < length of C
    If A[ACtr] < B[BCtr] then C[CCtr++] = A[ACtr++]
    Else C[CCtr++] = B[BCtr++]
    If ACtr is equal to the length of A,
      then copy the remaining values in B to C and exit the loop.
    If BCtr is equal to the length of B,
      then copy the remaining values in A to C and exit the loop.
 */
public class Question10 {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9};
        int[] B = {2, 4, 6, 8, 10};
        int[] C = merge(A, B);
        printArray(C);
    }

    public static int[] merge(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        int ACtr = 0;
        int BCtr = 0;
        int CCtr = 0;

        while (CCtr < C.length) {
            if (ACtr < A.length && BCtr < B.length) {
                if (A[ACtr] < B[BCtr]) {
                    C[CCtr++] = A[ACtr++];
                } else {
                    C[CCtr++] = B[BCtr++];
                }
            } else if (ACtr == A.length) {
                C[CCtr++] = B[BCtr++];
            } else if (BCtr == B.length) {
                C[CCtr++] = A[ACtr++];
            }
        }

        return C;
    }

    public static void printArray(int[] L) {
        for (int i = 0; i < L.length; i++) {
            System.out.print(L[i] + " ");
        }
    }
}
