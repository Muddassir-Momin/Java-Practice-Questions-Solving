import java.util.Scanner;
public class Q5AreaofCircleFunc{
    public static float Area(float r){
          return 3.1416f*(r*r);
    }                                                       
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Radius of Circle :");
        float r=s.nextFloat();
        System.out.println("Area of Circle is " + Area(r));
    }
}

