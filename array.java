import java.util.Scanner;

class dog{



    void bark(){
        System.out.println("barking");
    }
    void eat(){
        System.out.println("eating");
    }
}



public class array {
    
    public static void main(String [] args){

        // Scanner sc = new Scanner(System.in);
        dog[] pets;
        pets = new dog[7];
       pets[0] = new dog();
       pets[1] = new dog();
       pets[0].bark();
       

    }
}
