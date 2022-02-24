import java.util.Scanner;
import java.util.Calendar;

public class CartaoDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String nome;
        int numero, codigo, anoValidade, mesValidade;
		Calendar calendario = Calendar.getInstance();
		int ano = calendario.get(Calendar.YEAR);
		int mes = 1+calendario.get(Calendar.MONTH);

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Numero: ");
        numero = sc.nextInt();
        System.out.print("Codigo: ");
        codigo = sc.nextInt();
               
        do {
            System.out.print("Ano da Validade: ");
            anoValidade = sc.nextInt();
            if (anoValidade < ano) {
                System.out.println("Ano invalido");
            }
        } while(anoValidade < ano);

		do {
			System.out.print("Mes da Validade: ");
			mesValidade = sc.nextInt();
            if ((anoValidade==ano) && (mesValidade < mes)) {
                System.out.println("Mes invalido");
            }
		} while ((anoValidade==ano) && (mesValidade < mes));

        System.out.println("Cartao validado!");
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("Codigo: " + codigo);
        System.out.println("Validade: " + mesValidade + "/" + anoValidade);

        sc.close();
    }
}