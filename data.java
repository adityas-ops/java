import java.util.Scanner;

public class data {
   
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
    boolean b = true;
    System.out.println(b);
    // float f = 10.167f;
    // float f2 = 10.1123f;
    // float f3 = f+f2;
    // System.out.println(f3);
    // System.out.println("enter your name : ");
    // String sc = s.nextLine();
    // System.out.println("your name is : "+sc);
    String va = "ABC123";
    String va2 = "abc"+123;
    if(va.equals(va2)){
        System.out.println("same");
    }
    else{
        System.out.println("not same");
    }
    String vaa = "Aditya";
    boolean b2 = "aditya".equals(vaa);
    System.out.println(b2);
    boolean ma = "aditya".equalsIgnoreCase(vaa);
    System.out.println("this is another method to comapre : "+ma);

    }
    }
    
