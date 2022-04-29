public class RegistroAcademico {
	private String nomeDoAluno;
	private String matricula;
	private String curso;
	
	public RegistroAcademico(String nomeDoAluno, String matricula, String curso) {
		this.nomeDoAluno =  nomeDoAluno;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public String toString() {
		String result = "";
		result += ("Nome: " + this.nomeDoAluno + "\n");
		result += ("Matricula: " + this.matricula + "\n");
		result += ("Curso: " + this.curso + "\n");
		return result;
	}
}
