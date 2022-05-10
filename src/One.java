import java.util.Scanner;

public class One {
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
        System.out.println("Enter discount A %");
        double discountA = in.nextInt();
        double price, priceA, priceB, dA;
        dA = (100-discountA)/100;
        priceA = amountA * a * dA;
        priceB = amountB * b;
        price = priceA+priceB;
        System.out.println(price);
    }
}
