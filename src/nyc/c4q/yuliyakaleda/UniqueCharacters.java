package nyc.c4q.yuliyakaleda;

/**
 * C4Q, AccessCode
 * Yuliya Kaleda
 * Unique Characters
 * Created 3/24/15
 */
public class UniqueCharacters {

    public static void main(String[] args) {
        System.out.println(uniqueCharacters("microsoft"));
    }

    public static String uniqueCharacters(String string) {
        //create an empty string to add unique characters
        String newString = "";

        //check if each char/substring of a given string is not in the newString
        for (int i = 0; i < string.length(); i++) {
                if (!newString.contains(string.substring(i,i+1))) {
                    newString += string.charAt(i);
                }
            }
        return newString;
        }
    }



