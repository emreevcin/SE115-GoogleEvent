package Week_11;

/*
    Question: Convert the following binary numbers to decimals. Show your work.
(100101)2 =
(1001)2 =
(1110)2 =
(11001)2 =
(10)2 =
 */

public class Question7 {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("100101"));
        System.out.println(binaryToDecimal("1001"));
        System.out.println(binaryToDecimal("1110"));
        System.out.println(binaryToDecimal("11001"));
        System.out.println(binaryToDecimal("10"));
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += Integer.parseInt(String.valueOf(binary.charAt(i))) * Math.pow(2, power++);
        }
        return decimal;
    }
}
