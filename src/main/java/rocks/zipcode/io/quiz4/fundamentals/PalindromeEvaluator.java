package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] substrings = StringEvaluator.getAllSubstrings(string);
        ArrayList<String> palindromes = new ArrayList<>();
        for (String substring : substrings){
            if(isPalindrome(substring)){
                palindromes.add(substring);
            }
        }
        String [] result = new String [palindromes.size()];
        result = palindromes.toArray(result);
        return result;
    }

    public static Boolean isPalindrome(String string) {
        if (string.equals(reverseString(string))){
            return true;
        }
        return false;
    }

    public static String reverseString(String string) {
        String reversedString = "";
        String [] stringArray = string.split("");
        for (int i = string.length()-1; i >= 0 ; i--) {
             reversedString += stringArray[i];
        }
        return reversedString;
    }
}
