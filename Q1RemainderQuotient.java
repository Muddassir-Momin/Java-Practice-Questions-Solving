import java.util.Scanner;
public class Q1RemainderQuotient{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Dividend :");
        float Dividend=s.nextFloat();
        System.out.println("Enter Divisor :");
        float Divisor=s.nextFloat();
        float remainder=Dividend%Divisor;
        float quotient=Dividend/Divisor;
        System.out.println("Remainder is "+ remainder);
        System.out.println("Quotient is "+ quotient);
    }
}


