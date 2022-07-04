
class test{
    public int a;// public access
    int b; //default access
    private int c; // private access

    // creating function
    void setc(int i){
        c = i;
    }
    int getc(){
        return c;
    }


}


public class method2 {
    public static void main(String [] args){
        test oo = new test();
        oo.a = 10;
        oo.b = 20;
        // cannot access c because this is a private access 
        System.out.println(oo.a+" "+oo.b);
    }
    
}
