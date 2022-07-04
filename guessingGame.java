import java.util.Scanner;


class player{
   int num= 0;
    int guess(){
       num = (int)(Math.random()*10);
       System.out.println("I'm guessing : "+num);
         return num;
   }
}

 class GuessGame{
    player p1;
    player p2;
    player p3;

    void startGame(){
        p1 = new player();
        p2 = new player();
        p3 = new player();
        int guessp1     = 0;
        int guessp2     = 0;
        int guessp3     = 0;
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        while(true){
            System.out.println("number to guess is: " +targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.guess();
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.guess();
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.guess();
            System.out.println("Player three guessed " + guessp3);
            if(guessp1 == targetNumber){
                p1isRight = true;
            }
            if(guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }
            if(p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break;
            }
            else{
                System.out.println("Players will have to try again.");
            }
        }
       
    }
}



public class guessingGame {
    public static void main(String [] args){
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
