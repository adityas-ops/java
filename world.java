import java.util.Scanner;

public class world {

    static public void main(String []args){
        System.out.print("hello world");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = s.nextInt();
        System.out.println("Sum of two number is : "+(num1+num2));
        
       
s.close();

    }


}
