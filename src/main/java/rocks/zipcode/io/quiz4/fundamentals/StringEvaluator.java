package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> substring = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++)
                substring.add(string.substring(i, j));
        }
        Set substringSet = new HashSet(substring);
        String [] substringArray = new String [substringSet.size()];
        substringSet.toArray(substringArray);
        //substringArray = substring.toArray(substringArray);
        return substringArray;
    }


    public static String[] getCommonSubstrings(String string1, String string2) {

        String [] s1substringsArray = getAllSubstrings(string1);
        String [] s2substringsArray = getAllSubstrings(string2);
        ArrayList<String> string1Substrings = new ArrayList<>(Arrays.asList(s1substringsArray));
        ArrayList<String> string2Substrings = new ArrayList<>(Arrays.asList(s2substringsArray));
        string1Substrings.retainAll(string2Substrings);
        //OR string1Substrings.retainAll(Arrays.asList(s2substringsArray);
        String [] result = new String [string1Substrings.size()];
        result = string1Substrings.toArray(result);
        return result;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String [] commonSubstrings = getCommonSubstrings(string1, string2);
        Integer tempLargest = 0;
        String longestString = "";
        for(String substring : commonSubstrings){
            if(substring.length() > tempLargest){
                tempLargest = substring.length();
                longestString = substring;
            }
        }
        return longestString;
    }
}
