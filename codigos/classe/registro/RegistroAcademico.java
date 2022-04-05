public class RegistroAcademico {
	private String nome;
	private int matricula;
	private int codigoCurso;
	private double percentualDeCobranca;

	public void inicializaRegistro(String n, int m, int c, double p) {
		nome = n;
		matricula = m;
		codigoCurso = c;
		percentualDeCobranca = p;
	}

	public double calculaMensalidade() {
		return 100*codigoCurso*percentualDeCobranca;
	}
}
