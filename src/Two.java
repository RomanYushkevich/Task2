import java.util.Scanner;

public class Two {
    public static void main(String[] arqs){
        System.out.println("Enter price A");
        Scanner in =new Scanner(System.in);
        double a = in.nextInt();
        System.out.println("Enter quantity A");
        double amountA = in.nextInt();
        System.out.println("Enter price B");
        double b = in.nextInt();
        System.out.println("Enter quantity B");
        double amountB = in.nextInt();
        double price, priceA, priceB;
        priceA = amountA * a;
        priceB = amountB * b;
        price = (priceA+priceB)*90/100;
        System.out.println(price);
    }
}
