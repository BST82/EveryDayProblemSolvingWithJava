

class sortArraymanuallly{


public static void sorting(int [] arr){
    for(int i=1;i<arr.length;i++){
        if(arr[i]<arr[i-1]){
            arr[i]=arr[i]+arr[i-1];
            arr[i-1]=arr[i]-arr[i-1];
            arr[i]=arr[i]-arr[i-1];
            i=0;
        }
    }

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
 public static void main(String arr[]){
    int[] arr2= {1,5,3,2};
sorting(arr2);
 }
}

