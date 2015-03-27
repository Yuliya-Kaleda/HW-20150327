package nyc.c4q.yuliyakaleda;

/**
 * C4Q, AccessCode
 * Yuliya Kaleda
 * Unique Characters
 * Created 3/24/15
 */

public class CodeBreaker2 {
    public static void main(String[] args) {
        printResult("awnkac", "xtkhxz");
    }

    public static void printResult(String s1, String s2) {
        if (codeBreaker(s1, s2)) {
            System.out.println("The ciphers represent the same message.");
        } else {
            System.out.println("The cipher do not represent the same message.");
        }
    }

    public static boolean codeBreaker(String s1, String s2) {
        //calculate offset
        int offset = s2.charAt(0) - s1.charAt(0);

        //create a new string that will hold a new cipher
        String s3 = "" + s1.charAt(0);

        for (int i = 1; i < s1.length(); i++) {
            //get index of the next char by ASCII
            int newIdx = (s1.charAt(i) + offset - 97);
            char toAdd = (char)((newIdx % 26)+97);
            s3 += toAdd;
        }
        return (s2.equalsIgnoreCase(s3));
        }
    }