import java.util.Arrays;
import java.util.TreeSet;

public class TestaConjunto {
	public static void main(String[] args)
	{
		String[] cores = {"amarelo", "verde", "preto", "cinza", "branco", "laranja", "preto", "vermelho", "verde"};
		TreeSet<String> arvore = new TreeSet<>(Arrays.asList(cores));
		System.out.print("Conjunto ordenado: ");
		System.out.println(arvore);
		
		System.out.print("Antes de \"laranja\": ");
		System.out.println(arvore.headSet("laranja"));
		
		System.out.print("A partir de \"laranja\": ");
		System.out.println(arvore.tailSet("laranja"));
		
		System.out.printf("Primeira cor: %s%n", arvore.first() );
		
		System.out.printf("Ultima cor: %s%n", arvore.last() );
	}
}
