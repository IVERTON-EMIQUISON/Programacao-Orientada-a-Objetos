public class CaixaBanco {
	private static int clientesAtendidos = 0;
	private int numeroCaixa;

	CaixaBanco(int n) {
		this.numeroCaixa = n;
	}

	public void iniciaAtendimento() {
		setClientesAtendidos(getClientesAtendidos() + 1);
		System.out.println("Cliente " + clientesAtendidos + " dirija-se ao caixa " + numeroCaixa);
	}

	public static void setClientesAtendidos(int valor) {
		clientesAtendidos = valor;
	}
	public static int getClientesAtendidos() {
		return clientesAtendidos;
	}
}
