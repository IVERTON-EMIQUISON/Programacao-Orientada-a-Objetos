import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alvo = 5;
        final int maxTentativas = 5;
		int contador = 1;
		int chute;
        boolean acertou = false;
		
        System.out.println("Tente adivinhar o numero secreto em " + maxTentativas + " tentativas");
		
		do {
			System.out.print("Tentativa numero " + contador + ": ");
			chute = sc.nextInt();
			if (chute == alvo) {
				System.out.println("Parabens! Voce acertou o numero!");
				acertou = true;
			} else if (alvo > chute) {
				System.out.println("alvo > " + chute);		
			} else {
				System.out.println("alvo < " + chute);
			}
			contador++;
		} while((contador <= maxTentativas) && !acertou);
		
        if (!acertou) {
		    System.out.println("Suas tentivas se esgotaram");
        }
        
        sc.close();
    }
}