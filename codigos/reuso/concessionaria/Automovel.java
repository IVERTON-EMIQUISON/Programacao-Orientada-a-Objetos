public class Automovel {
	protected int ano;
	protected String modelo;
	protected String cor;
	
	Automovel(int ano, String modelo, String cor) {
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public double quantoCusta() {
		if (ano > 2000) {
			return 60000;
		} else {
			return 30000;
		}
	}
}
