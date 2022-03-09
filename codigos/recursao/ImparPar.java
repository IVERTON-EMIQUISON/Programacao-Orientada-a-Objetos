import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Numero: ");
        num = sc.nextInt();

        System.out.println(ehImpar(num) ? "Eh impar" : "Eh par");
        System.out.println(ehPar(num) ? "Eh par" : "Eh impar");
        
        sc.close();
    }

    public static boolean ehPar(int n) {
		return (n == 0 || ehImpar(n-1));
	}
	
	public static boolean ehImpar(int n) {
		return (n!=0 && ehPar(n-1));
	}
}