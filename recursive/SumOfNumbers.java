    public class SumOfNumbers {
    
    // Recursive function to find the sum of all numbers till n
    public static int sum(int n) {
        // Base case: if n is 0, the sum is 0
        if (n == 0) {
            return 0;
        } 
        // Recursive case: sum of numbers till n is n plus the sum of numbers till n-1
        else {
            return n + sum(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int number = 3; // Example number
        int result = sum(number);
        System.out.println("The sum of all numbers till " + number + " is: " + result);
    }
}
