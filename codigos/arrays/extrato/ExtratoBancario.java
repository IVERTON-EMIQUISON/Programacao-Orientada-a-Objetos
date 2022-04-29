import java.util.ArrayList;

public class ExtratoBancario {
	private float saldo;
	private static final boolean APRIMORADO = false;
	private ArrayList<Float> transacoes;

	public ExtratoBancario() {
		transacoes = new ArrayList<>();
		this.saldo = 0f;
	}

	public boolean transacao(float valor) {
		if(this.saldo + valor < 0f) {
			return false;
		}
		this.saldo += valor;
		transacoes.add(valor);
		return true;
	}

	public void visualiza() {
		System.out.println("Movimentacoes: ");
		if (APRIMORADO) {
			for (float valor : transacoes) {
				System.out.println(valor);
			}
		} else {
			for (int i = 0; i<transacoes.size(); i++) {
				System.out.println(i + " - " + transacoes.get(i));
			}
		}
		System.out.println("Saldo: " + this.saldo);
	}
}
