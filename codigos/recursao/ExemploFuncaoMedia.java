import java.util.Scanner;

public class ExemploFuncaoMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;

        System.out.print("n1: ");
        n1 = sc.nextDouble();
        System.out.print("n2: ");
        n2 = sc.nextDouble();
        System.out.print("n3: ");
        n3 = sc.nextDouble();

        System.out.println("Media: "  + media(n1, n2, n3));
        
        sc.close();
    }

    public static double media(double n1, double n2, double n3) {
        return ((n1+n2+n3)/3);
    }
}