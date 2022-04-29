public class CalculoPiQuadradoSobre6 {
	public static void main(String[] args) {
		final int MAX_NUM = 1000000;
		double denominador;
		double[] termosDaSerie = new double[MAX_NUM];

		for(int i=0; i<termosDaSerie.length; i++){
			denominador = i+1.;
			termosDaSerie[i] = 1./(denominador*denominador);
		}

		for (int i = 10; i <= MAX_NUM; i*=10) {
			calculaEMostraSomatoria(termosDaSerie, i);
		}
	}

	private static void calculaEMostraSomatoria(double[] array, int num) {
		double somatoria = 0;

		for(int indice=0; indice<num; indice++) {
			somatoria += array[indice];
		}

		System.out.println("Indice Maximo: " + num + " \tSomatoria: " + somatoria);
	}
}
