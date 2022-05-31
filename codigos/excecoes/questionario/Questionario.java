public class Questionario {

	public static void main(String[] args) {
		int[] respostas = {1, 2, 5, 0, 3, 5, 2, 1, 3, 3}; // troque um dos elementos por 14
		int[] frequencia = new int[6];
		for (int resposta = 0; resposta < respostas.length; resposta++) {
			++frequencia[respostas[resposta]];
		}
		System.out.println("Resposta\tFrequencia");
		for (int resposta = 0; resposta < frequencia.length; resposta++) {
			System.out.println(resposta + "\t\t" + frequencia[resposta]);
		}
	}
}
