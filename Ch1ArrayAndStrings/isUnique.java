package Ch1ArrayAndStrings;

public class isUnique{

    public static boolean checkIsUnique(String s){
        if(s.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for(int i = 0 ; i < s.length() ; i++){
            int index = s.charAt(i);
            if(char_set[index]){
                return false;
            }
            char_set[index] = true;
        }
        return true;
    }

    public static void main(String [] args){
        System.out.println(checkIsUnique("heloplie")); // false
        System.out.println(checkIsUnique("helo")); // true
    }
}