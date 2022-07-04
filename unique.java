public class unique {
    public static void main(String [] args){
        int arr[] = {1,3,4,5,6,7};
        int nArr = arr.length;
        int larg = 0;
        for(int i = 0; i<nArr;i++){
            if(arr[i]> larg){
                larg = arr[i];
            }
        }
        // System.out.print(larg);
        int hash[] = new int[larg+1];
        for(int i = 0; i<larg;i++){
            hash[arr[i]]++;
        }
        System.out.println(hash[2]);
    }
}
