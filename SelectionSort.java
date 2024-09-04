import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner myobj=new Scanner(System.in);
        System.out.println("how many numbers are you gonna sort using selection sort?");
        int num=myobj.nextInt();
        int[] array=new int[num];
        System.out.println("enter the numbers: ");
        for(int i=0;i<num;i++){
            array[i]=myobj.nextInt();
        }
        System.out.println("\nUNsorted: ");
        printArray(array);
         
        selectionSort(array);
        System.out.println("\nSorted: ");
        printArray(array);
    }
    private static void selectionSort(int[] array){
        int len=array.length;
        // for (int i = 0; i < len; i++) {
        //     for(int j=i+1;j<len;j++){
        //         if(array[j]<array[i]){
        //             int temp=array[i];
        //             array[i]=array[j];
        //             array[j]=temp;
        //             printArray(array);
        //             System.out.println("");
        //         }
        //     }
            
        // }we cant do this cause in selection sort we find the minimum and then swap but this code swaps with every comparison
        for(int i=0;i<len;i++){
            int minIndex=i;
            for(int j=i+1;j<len;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            int temp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;
        }
    }
    private static void printArray(int[] array){
        for(int x:array){
            System.out.println(x+"");
        }
    }
}
