public class Funcionario extends Pessoa {
	private double salario;
	
	Funcionario(String nome, String identidade, double salario) {
		super(nome, identidade);
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public String toString() {
		String result = super.toString();
		result += ("Salario: " + this.salario + "\n");
		return result;
	}
}
