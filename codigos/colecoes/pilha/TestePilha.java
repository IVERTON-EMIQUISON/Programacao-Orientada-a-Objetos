import java.util.Stack;

public class TestePilha {
	
	public static void main(String[] args) {
		Stack<Number> pilha = new Stack<>();
		pilha.push(12L);
		System.out.println("Adicionou 12L");
		imprimePilha(pilha);
		
		pilha.push(34567);
		System.out.println("Adicionou 34567");
		imprimePilha(pilha);
		
		pilha.push(1.0F);
		System.out.println("Adicionou 1.0F");
		imprimePilha(pilha);
		
		pilha.push(1234.5678);
		System.out.println("Adicionou 1234.5678 ");
		imprimePilha(pilha);
		
		Number topo = null;
		while (!pilha.isEmpty()) {
			topo = pilha.pop();
			System.out.printf("Removeu %s%n", topo);
			imprimePilha(pilha);
		}
	}

	private static void imprimePilha(Stack<Number> pilha) {
		if (pilha.isEmpty()) {
			System.out.printf("a pilha estah vazia%n%n");
		} else {
			System.out.printf("a pilha contem: %s (top)%n", pilha);
		}
	}
}
