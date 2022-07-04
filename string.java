import java.util.*;
public class string {
    public static void main(String [] args){
        // different function of string 
        Scanner sc = new Scanner(System.in);
        String s = "aditya";
        
        System.out.println(s.toUpperCase()); // converts to upper case
        System.out.println(s.toLowerCase()); // converts to lower case
        System.out.println(s.charAt(0)); // returns the character at the specified index
        System.out.println(s.indexOf("i")); // returns the index of the first occurrence of the specified substring. if not found returns -1
        System.out.println(s.lastIndexOf("i")); // returns the index of the last occurrence of the specified substring. if not found returns -1
        System.out.println(s.substring(0,4)); // returns the substring of the specified range. if not found returns null
        // String n = sc.nextLine();
        // char a[] = n.toCharArray(); // converts to char array
        // System.out.println(a);
        String sa = "aditya";
        String sa2 = "xyz";
        if(sa.contains(sa2)){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }

        String sam = "vidya";
        String san = new String("vidya");
        System.out.println("this is another method to comapre : "+sam.equals(san));
        if(sam.equals(san)){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
        String str = "the lazy fox jumped over the brown fence";
         StringTokenizer tokenizer = new StringTokenizer(str); 
         while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
    