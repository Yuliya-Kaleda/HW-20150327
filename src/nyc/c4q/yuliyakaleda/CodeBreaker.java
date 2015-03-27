package nyc.c4q.yuliyakaleda;

/**
 * C4Q, AccessCode
 * Yuliya Kaleda
 * Unique Characters
 * Created 3/24/15
 */

public class CodeBreaker {
    public static void main(String[] args) {
        printResult("cde", "def");
    }

    public static void printResult(String s1, String s2) {
        if (codeBreaker(s1, s2)) {
            System.out.println("The ciphers represent the same message.");
        } else {
            System.out.println("The cipher do not represent the same message.");
        }
    }

    public static boolean codeBreaker(String s1, String s2) {
        //check if the strings are of the same length
        if (s1.length() == s2.length()) {

            for (int i = 0; i < s2.length()-1; i++) {
                //compare the offset between two chars in s1 and two chars in s2 when chars in s2 are > than chars in s1
                if (s2.charAt(i)>s1.charAt(i) && s2.charAt(i+1)>s1.charAt(i+1)) {
                    if (s2.charAt(i) - s1.charAt(i) != (s2.charAt(i + 1) - s1.charAt(i + 1))) {
                        return false;
                    }
                }

                //compare the offset between two chars in s1 and two chars in s2 when the following char in s1 is > than that number of char in s2
                else if (s2.charAt(i)>s1.charAt(i) && s2.charAt(i+1)<s1.charAt(i+1)) {
                    if (s2.charAt(i) - s1.charAt(i) != (s2.charAt(i + 1) - s1.charAt(i + 1))+26) {
                        return false;
                    }
                }

                //compare the offset between two chars in s1 and two chars in s2 when the first char in s1 is > than that number of char in s2
                else if (s2.charAt(i)<s1.charAt(i) && s2.charAt(i+1)>s1.charAt(i+1)) {
                    if (s2.charAt(i) - s1.charAt(i) + 26 != (s2.charAt(i + 1) - s1.charAt(i + 1))) {
                        return false;
                    }
                }

                //compare the offset between two chars in s1 and two chars in s2 when both chars in s1 are > than chars in s2
                else {
                    if (s2.charAt(i)<s1.charAt(i) && s2.charAt(i+1)<s1.charAt(i+1)) {
                        if (s2.charAt(i) - s1.charAt(i) + 26 != (s2.charAt(i + 1) - s1.charAt(i + 1))+26) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}
