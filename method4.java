import java.util.Scanner;

class name{
    static int a = 3;
    static int b;
   static void display(){
       System.out.println("a : "+a);
   }
}


public class method4 {
static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        name.display();
        System.out.println("enter the value of b : ");
        name.b = sc.nextInt();
        String s =new String();
        // s = "this is my new string";

        if(name.b != 3){
            System.out.println("this is not 3");
            System.out.println(s);
        }
        else{
            System.out.println("this is 3");
        }


    }
}
