import java.util.Scanner;

public class Divisao {
	public static int divisao(int numerador, int denominador) {
		return numerador / denominador;
	}
	
	public static void main(String[] args) 	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira o numerador: ");		
		int numerador = scanner.nextInt();
		
		System.out.print("Insira o denominador: ");		
		int denominador = scanner.nextInt();
		
		int resultado = divisao(numerador, denominador);
		
		System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
		scanner.close();
	}
}
