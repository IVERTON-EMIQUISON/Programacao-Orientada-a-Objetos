import java.util.Scanner;
import java.util.Calendar;

public class Cartao {
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

        System.out.print("Ano da Validade: ");
        anoValidade = sc.nextInt();        
        while(anoValidade < ano) {
			System.out.println("Ano invalido");
            System.out.print("Ano da Validade: ");
            anoValidade = sc.nextInt();
        }

        System.out.print("Mes da Validade: ");
        mesValidade = sc.nextInt();
		while ((anoValidade==ano) && (mesValidade < mes)) {
			System.out.println("Mes invalido");
			System.out.print("Mes da Validade: ");
			mesValidade = sc.nextInt();
		}

        System.out.println("Cartao validado!");
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("Codigo: " + codigo);
        System.out.println("Validade: " + mesValidade + "/" + anoValidade);

        sc.close();
    }
}