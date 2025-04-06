import java.util.Scanner;

public class Q10hypotenuseRAT {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Side A:");
        int a=s.nextInt();
        System.out.println("Enter Side B:");
        int b=s.nextInt();
        double hypotenuse= Math.sqrt((a*a)+(b*b));
        System.out.println("Hypotenuse Of Right Angled Triangle is "+hypotenuse);
    }
}
