class TestaTriangulo {

	public static void main(String[] args) {
		Triangulo t1, t2, t3;
		t1 = new Triangulo();
		t2 = new Triangulo();
		t1.inicializar(2.5f, 2.5f, 2.5f, "equilatero");
		t2.inicializar(2.5f, 2.5f, 2.5f, "equilatero");
		t3 = t1;
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
	}
}
