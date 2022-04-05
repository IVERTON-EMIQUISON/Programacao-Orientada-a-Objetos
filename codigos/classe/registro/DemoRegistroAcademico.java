public class DemoRegistroAcademico {

	public static void main(String[] args) {
		RegistroAcademico michael = new RegistroAcademico();
		RegistroAcademico roberto = new RegistroAcademico();
		michael.inicializaRegistro("Michael", 189615, 2, 100.0);

		System.out.println("A mensalidade de Michael eh " + michael.calculaMensalidade());
		System.out.println("A mensalidade de Roberto eh " + roberto.calculaMensalidade());
	}

}
