package Week_12;

/*
What would be the output of the following statements? Explain why.
String a = “kaya”
String b = “kaya”
System.out.println(a == b);
 */

public class Question11 {
    public static void main(String[] args) {
        String a = "kaya";
        String b = "kaya";
        System.out.println(a == b);
    }
}

/*
    Output: true
    Explanation: The == operator compares the references of the two objects. Since both a and b are pointing to the same object, the output is true.
 */

/*
Long Explanation:

Both a and b are string literals and string literals in Java are stored in a string pool. When a string literal is encountered, Java checks if the same string literal exists in the pool; if it does, it reuses it instead of creating a new object.

So, the output of System.out.println(a == b); will be true. This is because both a and b point to the same string literal in the string pool due to Java's string interning mechanism. Hence, a == b evaluates to true as they refer to the same memory location.

 */