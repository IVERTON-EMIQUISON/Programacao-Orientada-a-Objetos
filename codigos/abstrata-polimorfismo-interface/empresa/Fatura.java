public class Fatura implements Pagavel {
	private int quantidade;
	private double preco;

	public Fatura(int quantidade, double preco) {
		setQuantidade(quantidade);
		setPreco(preco);
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public double obterValorDoPagamento() {
		return quantidade*preco;
	}
}
