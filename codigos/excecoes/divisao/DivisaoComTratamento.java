import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisaoComTratamento {
	public static int divisao(int numerador, int denominador) {
		return numerador / denominador;
	}
	
	public static void main(String[] args) 	{
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Insira o numerador: ");		
			int numerador = scanner.nextInt(); // 100

			System.out.print("Insira o denominador: ");		
			int denominador = scanner.nextInt(); // 7 | 0 | ola

			int resultado = divisao(numerador, denominador);

			System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
			scanner.close();
		} catch (InputMismatchException inputMismatchException) {
			System.err.println("Excecao: " + inputMismatchException);
			System.out.println("A entrada deveria ser inteira. Por favor tente novamente.");
		} catch (ArithmeticException arithmeticException) {
			System.err.println("Excecao:" + arithmeticException);
			System.out.println("Zero nao eh um denominador valido. Por favor tente novamente.");
		} finally {
			scanner.close();
		}
	}
}
