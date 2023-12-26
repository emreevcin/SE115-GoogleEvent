package Week_11;

/*
    Question: Write the program which will output the following triangle. The user should enter the base value. If it is an even number, add 1 so that it becomes an odd number. The output is for the base size of 5.
  *
 ***
*****
 */

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        if (base % 2 == 0) {
            base++;
        }
        for (int i = 0; i < base; i += 2) {  // i = 0, 2, 4 Because we want to print 1, 3, 5 stars
            for (int j = 0; j < (base - i) / 2; j++) { // j = 0, 1, 2, 3, 4
                System.out.print(" "); // Print spaces (4, 3, 2, 1, 0) spaces in each line (i = 0, 2, 4) (base - i) / 2 spaces
            }
            for (int j = 0; j <= i; j++) { // j = 0, 1, 2, 3, 4
                System.out.print("*"); // Print stars (1, 3, 5) stars in each line (i = 0, 2, 4)  (i + 1) stars
            }
            System.out.print("\n");
        }
    }
}
