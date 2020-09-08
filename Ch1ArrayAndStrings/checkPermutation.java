package Ch1ArrayAndStrings;
// import java.util.*;

public class checkPermutation {
    public static boolean isPermutation(String a, String b){
        if(a.length() != b.length()) return false;
        int [] letters = new int[128];
        for(int i = 0 ; i < a.length() ; i++){
            int index = a.charAt(i);
            letters[index]++;
        }
        for(int j = 0; j < b.length(); j++){
            int index = b.charAt(j);
            letters[index]--;
        }
        for(int k = 0; k < letters.length; k++){
            if(letters[k] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        System.out.println(isPermutation("hello", "oehlq")); // false
        System.out.println(isPermutation("boba", "abob")); // true
    }

}
