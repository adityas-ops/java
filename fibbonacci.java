public class fibbonacci {
    public static void main(String [] args){
        int a = 9;
        int arr[] = new int[a+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i<=a;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[a]);

    }
    
}
