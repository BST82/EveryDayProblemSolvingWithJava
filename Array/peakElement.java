import java.util.Scanner;
class  peakElement{
    static int peak(int arr[],int n){
        if(n==1) return 0;
        if(arr[0]>arr[1])return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        
        int ans=0;
        for(int i=1;i<n-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
           ans=i;
            }
        }
        return ans;
    }
  
  public static void main(String[] args){
    

    int size;
    System.out.print("Enter Size of array:- ");
    Scanner sc= new Scanner(System.in);
    size=sc.nextInt();

    int arr[]=new int[size];
    
    for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
    }

      System.out.print(peak(arr,size));
  }

}