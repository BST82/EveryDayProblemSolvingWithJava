

class Kth_smallest_element{


public static void sorting(int [] arr,int k){
    for(int i=1;i<arr.length;i++){
        if(arr[i]<arr[i-1]){
            arr[i]=arr[i]+arr[i-1];
            arr[i-1]=arr[i]-arr[i-1];
            arr[i]=arr[i]-arr[i-1];
            i=0;
        }
    }

    
        System.out.print(arr[k-1]);
   
}
 public static void main(String arr[]){
    int[] arr2= {12, 3, 5, 7, 19 };
    int k=2;
sorting(arr2,k);
 }
}

