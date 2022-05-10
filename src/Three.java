import java.util.Scanner;

public class Three {
    public static void main(String[] arqs){
        System.out.println("Enter X");
        Scanner in =new Scanner(System.in);
        double x = in.nextInt();
        System.out.println("Enter Y");
        double y = in.nextInt();
        double a, b;
        b = y*y+x*x;
        a = Math.sqrt(b);
        System.out.println(a);
    }
}
