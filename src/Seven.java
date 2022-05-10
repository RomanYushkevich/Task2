import java.util.Scanner;

public class Seven {
    public static void main (String[] arqs) {
        System.out.println("Enter number n");
        Scanner in =new Scanner(System.in);
        double a = in.nextDouble();
        int b;
        double c,d,e;
        b = (int)a;
        c = a - b;
        d =0.5;
        e =-0.5;
        if (c>=d && a>0)
            b=b+1;
        if (c<=e && a<0)
            b=b-1;
        System.out.println(b);
    }
}
