

class ProbOne{

  public static int rat(int r,int unit,int[] arr,int n){

  int sum1=r*unit;
  int sum=0;
  for(int i=0;i<arr.length;i++){
   if(sum<=sum1){
sum+=arr[i];
   }
  }
  return abs(sum1-sum)
  }

    public static void main(String arr[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rats:- ");
  int rat;
  rat=sc.nextInt();
System.out.println("Enter number of units:- ");
  int units;
  units=sc.nextInt();
System.out.println("Enter size of array:- ");
  int n;
  n=sc.nextInt();

System.out.println("Enter array elements:- ");
  int[] arr=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }

System.out.println(rat(rat,units,arr,n));
    }
}