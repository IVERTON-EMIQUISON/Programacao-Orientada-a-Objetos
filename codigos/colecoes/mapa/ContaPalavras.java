import java.util.HashMap;
import java.util.TreeSet;

public class ContaPalavras {
	
	public static void main(String[] args) {
		String texto = "Lorem ipsum dolor sit amet consectetur adipiscing elit Cras consequat libero sit amet mi aliquam sollicitudin Nulla libero lectus laoreet congue pulvinar at pharetra ut lorem Integer sed leo ut urna finibus porttitor Nulla ornare ac ex ac consectetur Sed porta turpis id iaculis aliquam ex massa consectetur elit eu tristique ex eros dapibus eros Etiam rhoncus enim et tellus commodo lobortis pulvinar eget nisl Class aptent taciti sociosqu ad litora torquent per conubia nostra per inceptos himenaeos Sed cursus a lorem nec feugiat";
		HashMap<String, Integer> mapa = new HashMap<>();
		String[] palavras = texto.split(" ");

		for (String palavra: palavras) {
			String palavraMin = palavra.toLowerCase();
			if (mapa.containsKey(palavraMin)) {
				int num = mapa.get(palavraMin);
				mapa.put(palavraMin, num + 1);
			} else {
				mapa.put(palavraMin, 1);
			}
		}
		
		TreeSet<String> palavrasOrdenadas = new TreeSet<>(mapa.keySet());
		for (String palavra : palavrasOrdenadas) {
			System.out.printf("%s\t%s%n", palavra, mapa.get(palavra));
		}
	}
}
