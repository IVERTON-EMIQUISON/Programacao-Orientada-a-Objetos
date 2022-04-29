public class Pessoa {
	private String nome;
	private String identidade;
	
	Pessoa(String nome, String identidade) {
		this.nome = nome;
		this.identidade = identidade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getIdentidade() {
		return this.identidade;
	}
	
	public String toString() {
		String result = "";
		result += ("Nome: " + this.nome + "\n");
		result += ("Identidade: " + this.identidade + "\n");
		return result;
	}
}
