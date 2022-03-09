import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Numero: ");
        num = sc.nextInt();
        
        System.out.println("Fatorial de " + num + " = " + fatorial(num));
        
        sc.close();
    }

    public static long fatorial(int n) {
        if (n==0) {
            return 1;
        } else {
            return n*fatorial(n-1);
        }
    }
}