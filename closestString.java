import java.util.*;

public class closestString {
   static  int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        	int m = s.indexOf(word1);
        	int n = s.size();
		for(int i = m; i<n;i++){
		    if(word1 == word2){
		        return i;
		    }
		}
		return m;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t != 0){
            int n = sc.nextInt();
            ArrayList<String> s = new ArrayList<String>();
            for(int i = 0; i<n;i++){
                s.add(sc.next());
            }
            String word1 = sc.next();
            String word2 = sc.next();
            int ans = shortestDistance(s,word1,word2);
            System.out.println(ans);
            t--;
        }
    }
}
