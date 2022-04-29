public class TrianguloDePascal {

	public static void main(String[] args) {
		int numeroDeLinhas = 10;
		int[][] trianguloDePascal = new int[numeroDeLinhas][];

		for(int linha=0; linha<numeroDeLinhas; linha++) {
			trianguloDePascal[linha] = new int[2+linha];
		}

		trianguloDePascal[0][0] = 1;
		trianguloDePascal[0][1] = 1;
		for(int linha=1; linha<numeroDeLinhas; linha++) {
			trianguloDePascal[linha][0] = 1;
			for(int coluna=1; coluna<trianguloDePascal[linha].length-1; coluna++) {
				trianguloDePascal[linha][coluna] = trianguloDePascal[linha-1][coluna] +
						trianguloDePascal[linha-1][coluna-1];
			}
			trianguloDePascal[linha][trianguloDePascal[linha].length-1] = 1;
		}

		for(int linha=0; linha<numeroDeLinhas; linha++) {
			for(int coluna=0; coluna<trianguloDePascal[linha].length; coluna++) {
				System.out.print(trianguloDePascal[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}
