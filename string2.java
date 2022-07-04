// this program is mainly focus on spliting string into tokens.


import java.util.*;
public class string2 {
   static boolean checkSame(String a[],String b[]){
        if(a.length != b.length){
            return false;
        }
        for(int i = 0; i<a.length;i++){
            if(!a[i].equals(b[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        String animal = "monkey,cat, duck, dog, horse";
        StringTokenizer tokenizer = new StringTokenizer(animal, ",");
        System.out.println(tokenizer.countTokens());
        // print tokenizer
        // System.out.println(tokenizer.nextToken());
        int n = tokenizer.countTokens();
        for(int i = 0; i<n;i++){
            System.out.println(tokenizer.nextToken());
        }
        // this is another method to split string into many part using wild card

        String animala = "monkey,cat, duck, dog, horse";
        String a[] = animala.split(",");
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
        // split string using space
        System.out.println("this is split using space");
        String name = "hello aditya how are you";
        String b[] = name.split(" ");
        for(int i = 0; i<b.length;i++){
            System.out.println(b[i]);
        }
        // this is function of boolean data type in which we can check if two string are same or not 
        String name1[]= {"hello","adityas","how","are","you"};
        // check b and name1 are same or not if same print same else print not same
       boolean flag = checkSame(b,name1);
         if(flag){
              System.out.println("same");
         }
         else{
              System.out.println("not same");
         }
         // we can use differnet method to use different character sets for seperation
         String s = "over the brown fence";
         StringTokenizer tokenizer1 = new StringTokenizer(s,"oe");
            while(tokenizer1.hasMoreTokens()){
                System.out.println(tokenizer1.nextToken());
            }

      
    }
    
   
}

