package Week_11;

/*
    Question: Write a function that accepts two integer arrays of the same size. The function should create a new array that can store the values in both arrays. To combine (or merge) these two arrays, compare the elements one by one in each array and write the smaller value and then the larger value to the new array. The function should return the new array.

For example, for two arrays { 2, 10, 3 } and { 1, 3, 5 }, you should compare the first element of each, 2 and 1, and place 1, then 2 into the larger array. The final larger array should be {1, 2, 3, 10, 3, 5}
 */

public class Question2 {
    public static void main(String[] args) {
        int[] a = { 2, 10, 3 };
        int[] b = { 1, 3, 5 };
        int[] c = merge(a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            c[k++] = a[i] < b[j] ? a[i++] : b[j++];
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }
}
