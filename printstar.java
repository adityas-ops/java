import java.util.Scanner;


public class printstar {
    // print start 
   
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of lines star: ");
        int n = s.nextInt();

        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
