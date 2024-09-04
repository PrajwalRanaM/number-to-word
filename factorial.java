import java.math.BigInteger;
import java.util.*;
public class factorial {
    public static int product(int n){
        if(n==1){
            return 1;
        }
        else{
            return n* product(n-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter a number to find the factorial:");

        int n= myobj.nextInt();
        System.out.println("the factorial of "+ n +" is "+product(n) );
    }
}
