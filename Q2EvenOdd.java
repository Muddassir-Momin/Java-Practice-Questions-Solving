import java.util.Scanner;
public class Q2EvenOdd {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int a=s.nextInt();
        if(a%2==0)
        {
            System.out.println("This is Even Number");
        }
        else
        System.out.println("This is Odd Number");
    }
}
