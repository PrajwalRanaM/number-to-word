import java.util.*;
public class InsertionSortUserPrompt {
    public static void main(String[] args){
        System.out.print("how many numbers are you gonna sort? ");
        Scanner myobj=new Scanner(System.in);
        int num=myobj.nextInt();
        int[] arr=new int[num];
        System.out.println("enter the numbers:");
        for(int i=0;i<num;i++){
            arr[i]=myobj.nextInt();
        }
        System.out.print("unsorted array: ");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.print("Sorted array: ");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
