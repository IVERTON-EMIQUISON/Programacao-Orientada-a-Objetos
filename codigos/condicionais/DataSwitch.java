import java.util.Scanner;

public class DataSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int dia, mes, ano, dias;

        System.out.print("dia: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("ano: ");
        ano = sc.nextInt();
        
        String resultado = String.valueOf(dia) + " de ";
		switch (mes) {
			case 1:
				resultado += "janeiro ";
				break;
			case 2:
				resultado += "fevereiro ";
				break;
			case 3:
				resultado += "marco ";
				break;
			case 4:
				resultado += "abril ";
				break;
			case 5:
				resultado += "maio ";
				break;
			case 6:
				resultado += "junho ";
				break;
			case 7:
				resultado += "julho ";
				break;
			case 8:
				resultado += "agosto ";
				break;
			case 9:
				resultado += "setembro ";
				break;
			case 10:
				resultado += "outubro ";
				break;
			case 11:
				resultado += "novembro ";
				break;
			default:
				resultado += "dezembro ";
				break;
		}
		resultado += ("de " + ano);

        System.out.println(resultado);

		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dias = 31;
				break;
			case 2:
				dias = 28;
				break;
			default:
				dias = 30;
				break;
		}
		System.out.println("O mes " + mes + " possui " + dias + " dias");

        sc.close();
    }
}