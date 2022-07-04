import javax.naming.directory.SearchControls;
 class dog{
    int number;
    String name;
    String color;
    String breed;
    String size;
    String age;

    public dog(int number, String name, String color, String breed, String size, String age) {
        this.number = number;
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.size = size;
        this.age = age;
    }
    void bark(){
        System.out.println("Woof");
    }
    void display(){
        System.out.println("Number: "+number);
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Breed: "+breed);
        System.out.println("Size: "+size);
        System.out.println("Age: "+age);
        System.out.println("");
    }
}


public class claass {
    
   
    
    
    public static void main(String[] args) {
       dog d = new dog(1, "Buddy", "Brown", "Lab", "Medium", "2 years");
         d.bark();
         d.display();
        dog d2 = new dog(2,"loona", "white", "Lab", "Small", "3 years");
        d2.display();

        
    }
}
