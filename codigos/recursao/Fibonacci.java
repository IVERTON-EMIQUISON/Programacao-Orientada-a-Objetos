import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ind;

        System.out.print("Indice: ");
        ind =  sc.nextInt();

        System.out.println("fibItera(" + ind + ") = " + fibItera(ind));
        System.out.println("fibRec(" + ind + ") = " + fibItera(ind));
        
        sc.close();
    }

    public static int fibItera(int n) {
		int m1 = 1, m2 = 0, resp=0;
		if (n < 2) return n;
		for (int i = 2; i <= n; i++) {
			resp = m1 + m2;
			m2 = m1;
			m1 = resp;
		}
		return resp;
	}
	
	public static int fibRec(int n) {
		return (n>1) ? fibRec(n-1) + fibRec(n-2) : n;
	}
}