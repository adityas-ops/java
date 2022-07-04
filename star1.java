import java.util.*;

public class star1 {
    static public void main(String [] args){
       Scanner s = new Scanner(System.in);

       System.out.println("enter the first number :");
       int n = s.nextInt();
       System.out.println("enther the second number : ");
       int m = s.nextInt();
       for(int i = 1; i<=n;i++){
           for(int j = 1; j<=m ; j++){
               if(i == 1 || i == n || j ==1 || j == m){
                   System.out.print("x");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.print("\n");
       }



    }
}
