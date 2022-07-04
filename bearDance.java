public class bearDance {
    public static void main(String [] args){
        int beerNum = 9;
        String name = "bottles";
        while(beerNum>0){
            if(beerNum == 1){
                name = "bottle";
            }
            System.out.println(beerNum+" "+name+" of bear on the wall.");
            System.out.println(beerNum+" "+name+" of bear");
            System.out.println("take one down");
            System.out.println("pass it around");
            beerNum = beerNum-1;

            if(beerNum >0){
                System.out.println(beerNum+" "+name+ " of bear on the wall.");
            }
            else{
                System.out.println("no more bottles of bear on the walls");
            }
        }
    }
}
