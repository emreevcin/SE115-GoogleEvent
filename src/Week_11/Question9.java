package Week_11;

/*
    Question: Write a function that accepts three string variables and returns the longest of the three.
 */

public class Question9 {
    public static void main(String[] args) {
        System.out.println(longest("Google", "Developer", "Student"));
    }

    public static String longest(String a, String b, String c) {
        if (a.length() > b.length() && a.length() > c.length()) {
            return a;
        } else if (b.length() > a.length() && b.length() > c.length()) {
            return b;
        } else {
            return c;
        }
    }
}
