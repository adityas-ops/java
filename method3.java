





public class method3 {
    static int a = 2;
    static int b;
    static void meth(int i){
        System.out.println("i : "+i);
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    static{
        System.out.println("static intialised in way");
        b  = a*4;
    }
 
   
}
