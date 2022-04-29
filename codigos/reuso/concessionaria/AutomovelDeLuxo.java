public class AutomovelDeLuxo extends AutomovelBasico {
	private boolean arCondicionado;
	private boolean direcaoHidraulica;
	
	AutomovelDeLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado, boolean direcaoHidraulica) {
		super(ano, modelo, cor, airbag, radio);
		this.arCondicionado = arCondicionado;
		this.direcaoHidraulica = direcaoHidraulica;
	}
	
	public double quantoCusta() {
		double custo = super.quantoCusta();
		if (arCondicionado) custo+=3500;
		if (direcaoHidraulica) custo+=2500;
		return custo;
	}
	
	public String toString() {
		String result = "";
		result += ("Ano: " + ano + "\n");
		result += ("Modelo: " + modelo + "\n");
		result += ("Cor: " + cor + "\n");
		result += ("Airbag: " + (airbag? "Sim" : "Nao") + "\n");
		result += ("Radio: " + (radio? "Sim" : "Nao") + "\n");
		result += ("Ar condicionado: " + (arCondicionado? "Sim" : "Nao") + "\n");
		result += ("Direcao Hidraulica: " + (direcaoHidraulica? "Sim" : "Nao") + "\n");
		result += ("Custo: " + quantoCusta() + "\n");
		return result;
	}

}
