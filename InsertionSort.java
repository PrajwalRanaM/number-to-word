public class InsertionSort {
    public static  void main(String[] args){
        int arr[]={6,7,8,4,3,5};
        int len=arr.length;
        System.out.print("unsorted array is: ");
        for (int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        for( int i=1;i<len;i++){
            int j=i-1;
            int temp=arr[i];
           while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
           }
            arr[j+1]=temp;
        }
        System.out.print("sorted array is: ");
        for (int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
