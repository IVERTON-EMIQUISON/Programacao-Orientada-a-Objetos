import java.util.Scanner;

public class DemoExtrato {

	public static void main(String[] args) {
		int operacao;
		float valor;
		boolean encerrar = false;
		Scanner sc = new Scanner(System.in);
		ExtratoBancario extrato = new ExtratoBancario();

		do {
			System.out.printf("%n=======%n");
			System.out.println("1 - Deposito");
			System.out.println("2 - Saque");
			System.out.println("3 - Visualizar extrato");
			System.out.println("4 - Encerrar");
			System.out.print("Escolha uma operacao: ");
			operacao = sc.nextInt();

			switch(operacao) {
			case 1:
				System.out.print("Valor a depositar: ");
				valor = sc.nextFloat();
				if (extrato.transacao(valor)) {
					System.out.println("Valor depositado");
				} else {
					System.out.println("Valor nao depositado");
				}
				break;
			case 2:
				System.out.print("Valor a sacar: ");
				valor = sc.nextFloat();
				if (extrato.transacao(-valor)) {
					System.out.println("Valor sacado");
				} else {
					System.out.println("Valor nao sacado");
				}
				break;
			case 3:
				extrato.visualiza();
				break;
			default:
				System.out.println("Encerrando programa");
				encerrar = true;
				break;
			}
		} while(!encerrar);

		sc.close();
	}

}
