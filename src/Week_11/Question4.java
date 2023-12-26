package Week_11;

/*
    Question: Write a program that takes a number of arguments. For each argument, find the number of
 the character ‘a’ appears. The program should print the number of 'a's in all arguments.
 */

public class Question4 {
    public static void main(String[] args) {
        int totalAs = 0;
        for (String arg : args) {
            int count = 0;
            for (int i = 0; i < arg.length(); i++) {
                if (arg.charAt(i) == 'a' || arg.charAt(i) == 'A') {
                    count++;
                }
            }
            System.out.println("Number of 'a's in \"" + arg + "\": " + count);
            totalAs += count;
        }
        System.out.println("Total number of 'a's in all arguments: " + totalAs);
    }

}
