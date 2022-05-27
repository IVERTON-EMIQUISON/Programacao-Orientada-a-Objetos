import java.util.PriorityQueue;

public class TesteFila {
	
	public static void main(String[] args) {
		PriorityQueue<Double> fila = new PriorityQueue<>();

		fila.offer(9.8);
		fila.offer(3.2);
		fila.offer(5.4);

		System.out.print("Removendo da fila: ");

		while (fila.size() > 0) {
			System.out.printf("%.1f ", fila.peek());
			fila.poll();
		}
	}
}
