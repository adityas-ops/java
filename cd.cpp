#include<bits/stdc++.h>
using namespace std;

bool checkReverse(int arr[], int n,int sum)
{
    int count=0;
	for(int i=0;i<n;i++){
	    
	    if(arr[i]>=arr[i+1] && count<sum){
	        cout<<i<<endl;
	        count+=arr[i];
	        if(arr[i+1]>arr[i]){
	        break;
	    }
	    }
	    else if(arr[i] <=arr[i-1] && arr[i]<arr[i+1]&& count<sum){
	        cout<<i<<endl;
	        count+=arr[i];
	        if(arr[i+1]>arr[i]){
	        break;
	    }
	    }
	    
	    if(count>sum){
	        return false;
	    }
	    	}
	return true;
}

// Driven Program
int main()
{
	int arr[] = {11,12,13,14,69,66,99,101};
	int n = sizeof(arr)/sizeof(arr[0]);
	checkReverse(arr, n, 137)? cout << "Yes" : cout << "No";
	return 0;
}