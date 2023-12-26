package Week_11;

/*
    Question: Write the following recursive function using a loop.
        public class Recursion {
          public static void main(String[] args) {
            int m = recurse(10);
            System.out.println(m);
            }
          public static int recurse(int a) {
            if(a == 1) return 1;
            return a + recurse(a - 1);
            }
        }
 */

public class Question5 {
    public static void main(String[] args) {
        int m = recurse(10);
        System.out.println(m);
    }

    public static int recurse(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a;
            a--;
        }
        return sum;
    }
}
