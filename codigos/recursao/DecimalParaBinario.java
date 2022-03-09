import java.util.Scanner;

public class DecimalParaBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec;

        System.out.print("Numero decimal: ");
        dec =  sc.nextInt();

        System.out.print("Numero binario: ");
        decimalParaBinario(dec);
        System.out.println();

        
        sc.close();
    }

    public static void decimalParaBinario(int n) {
		int d, r;
		d = n/2;
		if (d>0) decimalParaBinario(d);
		r = n%2;
		System.out.print(r);
	}
}