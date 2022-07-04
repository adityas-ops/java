import java.util.*;

public class anamgram {
   static void checkAnagram(String s,String s1){
        if(s.length() != s1.length()){
            System.out.println("not anagram");
        }
        else{
            char[] ch = s.toCharArray();
            char[] ch1 = s1.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);
            String s2 = new String(ch);
            String s3 = new String(ch1);
            if(s2.equals(s3)){
                System.out.println("anagram");
            }
            else{
                System.out.println("not anagram");
            }
        }
    }
    public static void main(String [] args){
        String str = "geeksforgeeks";
        String str2 = "forgeeksgeeks";
        checkAnagram(str,str2);
    }
}
