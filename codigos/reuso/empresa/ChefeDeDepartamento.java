public class ChefeDeDepartamento extends Funcionario {
	private String departamento;
	
	ChefeDeDepartamento(String nome, String identidade, double salario, String departamento) {
		super(nome, identidade, salario);
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	public String toString() {
		String result = super.toString();
		result += ("Departamento: " + this.departamento + "\n");
		return result;
	}
}
