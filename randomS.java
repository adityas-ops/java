import java.util.concurrent.CountDownLatch;

public class randomS {
    public static void main(String [] args){
        String[] wordListOne = { "24/7","multi- Tier","30,000 foot","B-to-B","win-win","front- end", "web-based","pervasive", "smart", "six- sigma","critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded","outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping- point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
        
        int length1 = wordListOne.length;
        int length2 = wordListTwo.length;
        int length3 = wordListThree.length;

        int rand1 = (int)( Math.random()*length1);
        int rand2 = (int)( Math.random()*length2);
        int rand3 = (int)( Math.random()*length3);
        String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
        System.out.println("this word is : "+ phrase);

   
   
    }
    
}