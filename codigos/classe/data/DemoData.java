public class DemoData {

	public static void main(String[] args) {
        /* VERSAO 1 */
		// System.out.println("Bem vindo ao programa da Data");

        /* VERSAO 2 */
		// Data d1 = new Data();
		// d1.dia = 45;
		// d1.mes = 15;
		// d1.ano = -1;
		// d1.mostraData();

        /* VERSAO 3 */
        Data d1 = new Data();
        d1.inicializaData(45, 15, -1);
        d1.mostraData();

		Data d2 = Data.natal(2011);
		d2.mostraData();
	}
}
