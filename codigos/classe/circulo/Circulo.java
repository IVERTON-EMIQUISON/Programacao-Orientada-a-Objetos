public class Circulo {
	private double raio;
	public static final double PI = 3.14;

	Circulo(double raio) {
		this.raio = raio;
	}

	public double perimetro() {
		return 2*PI*raio;
	}
}
