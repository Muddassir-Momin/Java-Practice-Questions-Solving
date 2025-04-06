import java.util.Scanner;
public class Q6RightAngleTriangleArea {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Height of Right Angle Triangle:");
        float Height=s.nextFloat();
        System.out.println("Enter Base of Right Angle Triangle:");
        float Base=s.nextFloat();
        float Area=0.5f*Base*Height;
        System.out.println("Area of Right Angle Triangle is " + Area +" Square Units");
    }
}
