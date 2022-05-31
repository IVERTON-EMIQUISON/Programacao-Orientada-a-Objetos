public class QuestionarioComTratamento {

	public static void main(String[] args) {
		int[] respostas = {1, 2, 5, 0, 3, 5, 2, 1, 3, 14};
		int[] frequencia = new int[6];
		for (int resposta = 0; resposta < respostas.length; resposta++) {
			try {
				++frequencia[respostas[resposta]];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.printf("respostas[%d] = %d%n%n", resposta, respostas[resposta]);
			}
		}
		System.out.println("Resposta\tFrequencia");
		for (int resposta = 0; resposta < frequencia.length; resposta++) {
			System.out.println(resposta + "\t\t" + frequencia[resposta]);
		}
	}
}
