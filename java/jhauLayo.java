import java.util.Scanner;

public class jhauLayo {
    private static final String[] sano={"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] alithulo={ "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixtenn", "seventeen", "eighteen", "nineteen"};
    private static final String[] thulo={"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] dheraithulo={"", "thousand", "million", "billion", "trillion", "quadrillion", "pentallion"};

    private static String sanokaam(long num){
        if (num==0) return "";
        else if (num<10) return sano[(int)num];
        else if (num<20) return alithulo[(int)(num-10)];
        else if(num<100) return thulo[(int)(num/10)]+" "+sano[(int)(num%10)];
        else return sano[(int)(num/100)]+" Hundred "+ sanokaam(num%100);

    }

    private static String thulokaam(long num){
        if (num==0) return "Zero";
        int counter=0;
        String result="";
        while(num>0){
            if(num%1000!=0){
                result= sanokaam(num%1000)+" "+dheraithulo[counter] + " "+result;
            }
            counter++;
            num/=1000;
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.print("Enter a number to convert into word:");
        Scanner obj=new Scanner(System.in);
        long num=obj.nextLong();
        
        System.out.println(thulokaam(num));

    }
    
}
