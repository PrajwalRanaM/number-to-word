import java.util.*;
public class SumOfNumbers {
    public static int sum(int num){
        int total;
        if (num==1){
            return 1;
        }
        else{
            total=num+sum(num-1);
            return total;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to find the summation of all the numbers from beginning");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();

        System.out.println("the summation is "+ sum(num));
    }
    
}
