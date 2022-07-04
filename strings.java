import java.util.*;

public class strings {
    public static void main(String [] args){
        // lower case and upper case 
        String s = "Aditya";
        System.out.println("in upper case "+s.toUpperCase());
        System.out.println("in lower case "+s.toLowerCase());
        // find length
        System.out.println("length of string is : "+s.length());
        // find any index characters
        System.out.println("d is index number : "+s.indexOf("tya"));

        // adding two string 
        String sc = "Sharma";
        System.out.println(s+" "+sc);
        // using concat to combine two string 
        System.out.println(s.concat(sc));
         // you can add number and string using + operator
         // if you add 5 + "5" = 55
         System.out.println(10+"10");
         System.out.println("10"+10);



         Scanner sac = new Scanner(System.in);
        String b = sac.nextLine();
        System.out.print(b);
        sac.close();
    }
}
