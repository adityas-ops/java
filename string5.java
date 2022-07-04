public class string5{
  static  public class Person{
        String name;
        int Age;
    
      public String toString(){
          return name+" "+Age;
      }
    }

    public static void main(String [] args){
    //    Person p = new Person("aditya",20);
    Person p = new Person();
    p.name="aditya";
    p.Age=20;
         System.out.println(p);

    }
}