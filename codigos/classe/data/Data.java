public class Data {
	/* VERSAO 2 */
	// int dia;
	// int mes;
	// int ano;
	/* VERSAO 3 */
	private int dia;
	private int mes;
	private int ano;

	Data() {
	}

	Data(int d, int m, int a) {
		inicializaData(d, m, a);
	}

	public void inicializaData(int d, int m, int a) {
		if (dataEhValida(d,m,a)) {
			dia = d;
			mes = m;
			ano = a;
		} else {
			dia = 0;
			mes = 0;
			ano = 0;
		}
	}

	/* simplificacao da validacao de uma data */
	private boolean dataEhValida(int d, int m, int a) {
		return ((d >=1) && (d <= 31) && (m >= 1) && (m <= 12) && (a>0));
	}

	public void mostraData() {
		System.out.print(dia);
		System.out.print("/");
		System.out.print(mes);
		System.out.print("/");
		System.out.println(ano);
	}

	public static Data natal(int ano) {
		return new Data(25,12,ano);
	}
}
