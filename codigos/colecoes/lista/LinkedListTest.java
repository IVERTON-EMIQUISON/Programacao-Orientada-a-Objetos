import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		String[] cores = {"magenta", "vermelho", "branco", "azul", "ciano"};
		LinkedList<String> lista = new LinkedList<String>(Arrays.asList(cores));
		
		String[] coresRemover = {"vermelho", "branco", "azul"};
		LinkedList<String> listaRemover = new LinkedList<String>(Arrays.asList(coresRemover));
		
		System.out.println("LinkedList: ");
		for (int count = 0; count < lista.size() ; count++)
			System.out.printf("%s ", lista.get(count) );
		
		removeCores(lista, listaRemover);
		
		System.out.printf("%n%nLinkedList apos remocao:%n");
		for (String cor : lista)
			System.out.printf("%s ", cor);
	}
	
	private static void removeCores(LinkedList<String> collection1, LinkedList<String> collection2) {
		Iterator<String> iterator = collection1.iterator();
		while(iterator.hasNext()) {
			if (collection2.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}
}
