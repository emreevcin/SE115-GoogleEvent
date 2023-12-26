package Week_11;

/*
    Question: Write a program that takes two arguments: your name and the number of times to print it on
the screen.
 */

public class Question3 {
    public static void main(String[] args) {
        printName("Google Developer Student Clubs IUE ♥️", 5);
    }

    public static void printName(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(name);
        }
    }
}
