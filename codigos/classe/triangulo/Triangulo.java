class Triangulo {
	private float lado1;
	private float lado2;
	private float lado3;
	private String descricao;

	public void inicializar(float l1, float l2, float l3, String desc) {
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;
		descricao = desc;
	}

	public float calculaPerimetro() {
		return lado1+lado2+lado3;
	}

}
