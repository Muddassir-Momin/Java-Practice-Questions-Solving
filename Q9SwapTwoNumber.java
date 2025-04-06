import java.util.Scanner;
public class Q9SwapTwoNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Two Number:");
        float no1=s.nextFloat();
        float no2=s.nextFloat();
        System.out.println("Before Swapping Of Two Number:\nA="+no1+" B="+no2);
        float ext;
        ext=no1;
        no1=no2;
        no2=ext;
        System.out.println("After Swapping of Two Number:\nA="+no1+" B="+no2);
    }
}
