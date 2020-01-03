package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;
import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    String input;

    public PalindromeObject(String input) {
        this.input = input;
    }

    public String[] getAllPalindromes(){
        String [] palObjectSubstrings = new PalindromeObject(input).getAllSubstrings();
        //String[] substrings = StringEvaluator.getAllSubstrings(input);
        ArrayList<String> palindromes = new ArrayList<>();
//        for (String substring : palObjectSubstrings){
//            if(substring.isPalindrome()){
//                palindromes.add(palObject);
//            }
//        }
        String [] result = new String [palindromes.size()];
        result = palindromes.toArray(result);
        return result;
    }

    public Boolean isPalindrome(){
        if (input.equals(new PalindromeObject(input).reverseString())){
            return true;
        }
        return false;
    }

    public String reverseString(){
        String reversedString = "";
        String [] stringArray = input.split("");
        for (int i = input.length()-1; i >= 0 ; i--) {
            reversedString += stringArray[i];
        }
        return reversedString;
    }

    public String[] getAllSubstrings() {
        ArrayList<String> substring = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++)
                substring.add(input.substring(i, j));
        }
        Set substringSet = new HashSet(substring);
        String [] substringArray = new String [substringSet.size()];
        substringSet.toArray(substringArray);
        //substringArray = substring.toArray(substringArray);
        return substringArray;
    }
}
