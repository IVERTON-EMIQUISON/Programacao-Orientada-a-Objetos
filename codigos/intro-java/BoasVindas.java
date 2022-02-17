import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.print("Nome: ");
        nome = entrada.next();
        System.out.println("Bem vindo(a) " + nome + "!");
        entrada.close();
    }
}