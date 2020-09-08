package Ch1ArrayAndStrings;

public class stringCompression {
    public static String stringComp(String str){
        int count = 0;
        char seen = str.charAt(0);
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length() ; i++){
            if(str.charAt(i) != seen){
                res.append(seen);
                res.append(count);
                seen = str.charAt(i);
                count = 0;
            }else{
                count++;
            }
        }
        return res.toString();
    }

    public static void main(String args[]){
        System.out.println(stringComp("aabccccaaa"));
    }
}
