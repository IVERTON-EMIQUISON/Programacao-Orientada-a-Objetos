public class Media {

	public static void main(String[] args)
	{
		double num1 = 10.0;
		double num2 = 20.0;
		double num3 = 30.0;
		double num4 = 40.0;

		System.out.printf("num1 = %.1f%nnum2 = %.1f%nnum3 = %.1f%nnum4 = %.1f%n%n", num1, num2, num3, num4);
		System.out.printf("Media de num1 e num2 eh %.1f%n", media(num1, num2) );
		System.out.printf("Media de num1, num2 e num3 eh %.1f%n", media(num1, num2, num3) );
		System.out.printf("Media de num1, num2, num3 e num4 eh %.1f%n", media(num1, num2, num3, num4) );
	}

	public static double media( double... numeros) {
		double total = 0.0;

		for (double d : numeros) {
			total += d;
		}
		return total / numeros.length ;
	}

}
