// this program is use for joing two string on method 
// joining string with a delimeter


import java.util.*;

public class string3 {
 
    public static void main(String [] args){
        String s[] = {"math","science","english","hindi"};
        String s1 = String.join("+",s);
        System.out.println(s1);
        String s2 = "math+science+english+hindi";
        stringSame(s1,s2);
        // use stringBuilder for another method to join string
        StringBuilder sb = new StringBuilder();
        StringBuffer sb1 = new StringBuffer();
        for(int i = 0; i<s.length;i++){
            sb.append(s[i]);
            sb1.append(s[i]);
        
            sb.append("+");
            sb.append("+");
        }
        String s3 = sb.toString();
        String s4 = sb1.toString();
        stringSame(s4, s2);
       
    }
    static  void stringSame(String s1,String s2){
        if(s1.equals(s2)){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
   
}
