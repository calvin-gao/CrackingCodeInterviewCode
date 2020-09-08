package Ch1ArrayAndStrings;

public class URLify {

    public static void changeURL(char[] str, int trueLength){
       int spaceCount = 0, index, i = 0;
       for(i = 0; i < trueLength; i++){
           if(str[i] == ' '){
               spaceCount++;
           }
       }
       index = trueLength + spaceCount * 2;
       if(trueLength < str.length) str[trueLength] = '\0';
       for(i = trueLength - 1; i >= 0; i--){
           if(str[i] == ' '){
               str[index - 1] = '0';
               str[index - 2] = '2';
               str[index - 3] = '%';
               index = index - 3;
           }else{
               str[index - 1] = str[i];
               index--;
           }
       }
    }
    public static void main(String [] args){
        char[] charArray = {'M', 'r', ' ','J', 'o', 'h', 'n' ,' ', 'S', 'm', 'i', 't', 'h'};
        changeURL(charArray, 13); 
        for(char c : charArray){
            System.out.println(c);
        }
    }
}
