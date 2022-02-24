import java.util.Scanner;

/*
* Possíveis testes: a, b, c = 
* 1, -5, 6
* 4, -4, 1
* 5, 1, 6
*/
public class Equacao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();
        System.out.print("c: ");
        c = sc.nextDouble();
        
		delta = b*b - 4*a*c;
		if (delta < 0) {
			System.out.println("A equacao nao possui raizes reais");
		} else {
			if (delta == 0) {
				x1 = -b/(2*a);
				System.out.println("A equacao possui uma raiz real igual a " + x1);
			} else {
				x1 = (-b+Math.sqrt(delta))/(2*a);
				x2 = (-b-Math.sqrt(delta))/(2*a);
				System.out.println("A equacao possui duas raizes reais iguais a " + x1 + " e " + x2);
			}
		}

        sc.close();
    }
}