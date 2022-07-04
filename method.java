 class valume{
    int height;
    int width;
    int length;
    public valume(int h, int w, int l){
        height = h;
        width = w;
        length = l;
    }
    void valumes(){
        System.out.println("Area is : "+ height*width*length);
    }
}



public class method {
    public static void main(String [] args){
        valume v = new valume(2,3,4);
        valume v2 = new valume(5, 10, 4);
        v2.valumes();
        v.valumes();
    }
}
