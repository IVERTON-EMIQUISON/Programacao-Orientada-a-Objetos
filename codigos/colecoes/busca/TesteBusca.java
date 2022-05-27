import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TesteBusca {
	
	public static void main(String[] args)
	{
		String[] cores = {"vermelho", "branco", "azul", "preto", "verde", "roxo", "laranja", "rosa"};
		ArrayList<String> lista = new ArrayList<>(Arrays.asList(cores));
		System.out.printf("ArrayList nao ordenada: %s%n", lista);
		
		Collections.sort(lista);
		System.out.printf("ArrayList ordenada: %s%n", lista);
		
		buscaElemento(lista, "preto");
		buscaElemento(lista, "vermelho");
		buscaElemento(lista, "rosa");
		buscaElemento(lista, "amarelo");
		buscaElemento(lista, "cinza");
		buscaElemento(lista, "turquesa");
	}


	private static void buscaElemento(ArrayList<String> lista, String alvo) {
		int resultado = 0;
		System.out.printf("%nBuscando %s%n", alvo);
		resultado = Collections.binarySearch(lista, alvo);
		if (resultado >= 0) {
			System.out.printf("Encontrado no indice %d%n", resultado);
		} else {
			System.out.printf("Nao encontrado (%d)%n", resultado);
		}
	}
}
