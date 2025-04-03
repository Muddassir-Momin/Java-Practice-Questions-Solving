import  java.util.Scanner;
public class Q3PositiveOrNegative {
    public static void  main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Integer :");
        float a=s.nextFloat();
        if(a<0)
        {
            System.out.println("This is Negative Number");
        }
        else if(a>=1)
        {
            System.out.println("This is Positive Number");
        }
        else
        System.out.println("This is Not a Positive or Not a Negative Number");
    }
}
