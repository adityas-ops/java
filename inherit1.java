import java.util.Scanner;

class a {
    int i = 1;
    int j = 2;
    void display(){
        System.out.println("display i and j : "+i+" "+j);
    }
}

class b extends a{
    Scanner sc = new Scanner(System.in);
    int k = 5;
    int m = sc.nextInt();
   void showk(){
       System.out.println(k);
       System.out.println(m);
   }
   


}

public class inherit1 {
    public static void main(String [] args){
        b m = new b();
        // Scanner s = new Scanner(System.in);
        m.display();
        m.showk();
        
    }
}

/** this is a multiple line comments  */
