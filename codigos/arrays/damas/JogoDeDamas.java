public class JogoDeDamas {
	public static final int LINHAS = 8;
	public static final int COLUNAS = 8;
	public static final int P1_LI = 0;
	public static final int P1_LF = 2;
	public static final int P2_LI = 5;
	public static final int P2_LF = 7;
	private char[][] tabuleiro;

	public static void main(String[] args) {
		JogoDeDamas jogo = new JogoDeDamas();
		System.out.println(jogo.toString());
	}

	public JogoDeDamas() {
		tabuleiro = new char[LINHAS][COLUNAS];
		int primCol;

		for(int linha=0; linha<LINHAS; linha++) {
			for(int coluna=0; coluna<COLUNAS; coluna++) {
				tabuleiro[linha][coluna] = '.';
			}
		}

		for(int linha=P1_LI; linha<=P1_LF; linha++) {
			primCol = (linha%2==0) ? 1 : 0;
			for(int coluna=primCol; coluna<COLUNAS; coluna+=2) {
				tabuleiro[linha][coluna] = 'o';
			}
		}

		for(int linha=P2_LI; linha<=P2_LF; linha++) {
			primCol = (linha%2==0) ? 1 : 0;
			for(int coluna=primCol; coluna<COLUNAS; coluna+=2) {
				tabuleiro[linha][coluna] = 'x';
			}
		}
	}

	public String toString() {
		String resultado = "";

		for(int linha=0; linha<LINHAS; linha++) {
			for(int coluna=0; coluna<COLUNAS; coluna++) {
				resultado += tabuleiro[linha][coluna] + " ";
			}
			resultado += "\n";
		}
		
		return resultado;
	}
}
