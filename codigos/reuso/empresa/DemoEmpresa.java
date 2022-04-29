public class DemoEmpresa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Maria", "148635");
		Funcionario funcionario = new Funcionario("Joao", "478963", 1543.4);
		ChefeDeDepartamento chefe = new ChefeDeDepartamento("Paula", "354464", 2464.68, "TI");
		
		System.out.println(pessoa);
		System.out.println(funcionario);
		System.out.println(chefe);
	}

}
