public class UsoFinallyThrow {
	public static void main(String[] args) {
		try {
			lancaExcecao();
		} catch (Exception excecao) {
			System.err.println("Excecao tratada na main");
		}
		naoLancaExcecao();
	}

	public static void lancaExcecao() throws Exception {
		try {
			System.out.println("Metodo lancaExcecao");
			throw new Exception("Excecao que criamos");
		} catch (Exception excecao) {
			System.err.println("Excecao tratada no metodo lancaExcecao");
			throw excecao;
		} finally {
			System.err.println("Finally executado em lancaExcecao");
		}
	}

	public static void naoLancaExcecao() {
		try {
			System.out.println("Metodo naoLancaExcecao");
		} catch (Exception exception) {
			System.err.println(exception);
		} finally {
			System.err.println("Finally executado em naoLancaExcecao");
		}
		System.out.println("Fim do metodo naoLancaExcecao");
	}
}
