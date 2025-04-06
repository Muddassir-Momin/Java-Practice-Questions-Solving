import java.util.Scanner;
public class Q8GreaterAmongTwoNum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Two Numbers:");
        float no1=s.nextFloat();
        float no2=s.nextFloat();
        if(no1>no2)
        {
            System.out.println("Greatest Number is "+no1);
        }
        else
        System.out.println("Greatest Number is "+no2);
    }
}