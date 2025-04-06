import java.util.Scanner;
public class Q7AreaofTriangleUsingHeron {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         System.out.println("Enter length of Side A:");
         float a=s.nextFloat();
         System.out.println("Enter length of Side B:");
         float b=s.nextFloat();
         System.out.println("Enter length of Side C:");                   //Not Understood
         float c=s.nextFloat();
         float p=(a+b+c)/2;
         float Area= p*(p-a)*(p-b)*(p-c);
         float l=Area;
        
         for(int i=0;i<10;i++)
         l=(l+Area/l)/2;
         System.out.println("Area of triangle using Heron is " + l);
        

    }
}
