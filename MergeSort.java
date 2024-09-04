import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("how many numbers do you wanna sort?");
        int num=myobj.nextInt();
        System.out.println("enter numbers to sort: ");
        int[] numbers=new int[num];
        for(int i=0;i<num;i++){
            numbers[i]=myobj.nextInt();
        }

        System.out.println("\nBefore: ");
        printArray(numbers);

        mergeSort(numbers);
        System.out.println(" ");
        System.out.println("After: ");
        printArray(numbers);
    }
    private static void mergeSort(int[] inputArray){
        int inputlength=inputArray.length;
        if(inputlength<2){
            return;
        }
        int midIndex=inputlength/2;

        //creating two seperate arrays 
        int[] leftHalf=new int[midIndex];
        int[] rightHalf=new int[inputlength-midIndex];

        //storing the data in left half
        for(int i=0; i<midIndex;i++){
            leftHalf[i]=inputArray[i];

        }
        //for right half
        for( int i=midIndex;i<inputlength;i++){
            rightHalf[i-midIndex]=inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray, leftHalf, rightHalf);
        
    }
    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize=leftHalf.length;
        int rightSize=rightHalf.length;
        int i=0, j=0, k=0;

        //comparing the numbers from right and left array
        while(i<leftSize && j<rightSize){
            if(leftHalf[i]<rightHalf[j]){
                inputArray[k]=leftHalf[i];
                i++;
            }
            else{
                inputArray[k]=rightHalf[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            inputArray[k]=leftHalf[i];
            i++;
            k++;
        }
        while(j<rightSize){
            inputArray[k]=rightHalf[j];
            j++;
            k++;
        }
    }
    
    private static void printArray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
