public abstract class Empregado implements Pagavel {
	protected String nome;
	protected String ctps;
	
	public Empregado(String nome, String ctps) {
		setNome(nome);
		setCTPS(ctps);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCTPS(String ctps) {
		this.ctps = ctps;
	}
}
