import java.util.Scanner;

public class Five {
    public static void main (String[] arqs) {
        System.out.println("Enter q");
        Scanner in =new Scanner(System.in);
        int q = in.nextInt();
        System.out.println("Enter w");
        int w = in.nextInt();
        int a,b;
        a = q/w;
        b = q % w;
        System.out.print("q/w=");
        System.out.print(a);
        System.out.print(" residue ");
        System.out.println(b);
    }
}
