package Ch1ArrayAndStrings;

public class OneAway {
    public static boolean checkOneAway(String s , String s1){
        if(s.length() == s1.length())
            return checkReplacement(s, s1);
        else if(s.length() + 1 == s1.length())
            return checkInsertion(s, s1);
        else if(s.length() - 1 == s1.length())
            return checkInsertion(s1,s);
        return false;
    }

    public static boolean checkReplacement(String s, String s1){
        boolean foundDifference = false;
        for(int i = 0 ; i < s1.length(); i++){
            if(s.charAt(i) != s1.charAt(i)){
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    public static boolean checkInsertion(String s, String s1){
        int index1 = 0;
        int index2 = 0;
        while(index1 < s.length() && index2 < s1.length()){
            if(s.charAt(index1) != s1.charAt(index2)){
                if(index1 != index2){
                    return false;
                }else{
                    index2++;
                }
            }else{
                index1++;
                index2++;
            }
        }
        return true;
    }

    
    public static void main(String[] args){
        System.out.println(checkOneAway("pale", "dale"));
    }
}
