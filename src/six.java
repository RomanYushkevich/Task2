import java.util.Scanner;

public class six {
    public static void main (String[] arqs) {
        System.out.println("Enter three digit number n");
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b,c,d,ostatok100,ostatok10;
        b = a/100;
        ostatok100 = a % 100;
        c = ostatok100 / 10;
        ostatok10 = a % 10;
        d = b + c + ostatok10;
        System.out.println(d);
    }
}
