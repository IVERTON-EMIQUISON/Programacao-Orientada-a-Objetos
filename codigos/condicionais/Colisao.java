import java.util.Scanner;

public class Colisao {
    public static void main(String[] args) {
        double x1, y1, r1, x2, y2, r2, dist;
        Scanner sc = new Scanner(System.in);

        System.out.print("x1: ");
        x1 = sc.nextDouble();
        System.out.print("y1: ");
        y1 = sc.nextDouble();
        System.out.print("r1: ");
        r1 = sc.nextDouble();
        System.out.print("x2: ");
        x2 = sc.nextDouble();
        System.out.print("y2: ");
        y2 = sc.nextDouble();
        System.out.print("r2: ");
        r2 = sc.nextDouble();

        dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        if (r1+r2 >= dist) {
            System.out.println("Os circulos colidem");
        } else {
            System.out.println("Os circulos NAO colidem");
        }

        sc.close();
    }
}