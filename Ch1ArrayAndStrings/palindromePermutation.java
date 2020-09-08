package Ch1ArrayAndStrings;

public class palindromePermutation {
    public static boolean isPalindromePermutation(String s){
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        // System.out.println(Character.getNumericValue('z'));
        // System.out.println(Character.getNumericValue('a'));
        for(char c : s.toCharArray()){
            int x = getCharNumber(c);
            if(x != -1){
                table[x]++;
                if(table[x] % 2 == 1){
                    countOdd++;
                }else{
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    public static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z){
            return val - a;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(isPalindromePermutation("Tacta Coa"));
    }
}
