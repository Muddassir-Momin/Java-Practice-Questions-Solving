import java.util.Scanner;
public class Q4AreaOfCircle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Radius of Circle :");
        float r=s.nextFloat();
        float Area=3.1416f*(r*r);
        System.out.println("Area Of Circle is " + Area);
    }
}
