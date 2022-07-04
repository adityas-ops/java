import java.util.*;
// mainly focus on stringBuffer 
public class String6 {
    public  static void main(String [] args){
        String s = "aditya";
       
        int n = s.indexOf("d");
        System.out.println(s.charAt(n));

        // string and stringbuffer
        s.concat(" Sharma");
        System.out.println(s);
        StringBuffer sb = new StringBuffer(s);
        // reverse string
        sb.reverse();
        sb.append(" Sharma");
        System.out.println(sb);
        // replace string
        sb.replace(0,6, "Golden");
        System.out.println(sb);
        // replace char
        sb.replace(0,1, "A");
        System.out.println(sb);
        // substring 
        System.out.println(sb.substring(0,5));



    }
}
