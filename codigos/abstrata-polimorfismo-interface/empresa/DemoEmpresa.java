public class DemoEmpresa {

	public static void main(String[] args) {
		EmpregadoAssalariado empregado = new EmpregadoAssalariado("Mike", "12345678", 1546.89);
		Fatura fatura = new Fatura(8, 1.30);
		
		imprimeCusto(empregado);
		imprimeCusto(fatura);
	}
	
	public static void imprimeCusto(Pagavel pagavel) {
		System.out.println("Valor do pagamento: " + pagavel.obterValorDoPagamento());
	}
}
