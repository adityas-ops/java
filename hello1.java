import java.text.NumberFormat.Style;
import java.util.Scanner;
public class hello1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter intger");
        int a = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.print(i*a+" ");
        }
        
    }
}
