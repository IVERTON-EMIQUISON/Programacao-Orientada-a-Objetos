public class EmpregadoAssalariado extends Empregado {
	private double salario;
	
	public EmpregadoAssalariado(String nome, String ctps, double salario) {
		super(nome, ctps);
		setSalario(salario);
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	@Override
	public double obterValorDoPagamento() {
		return getSalario();
	}
}
