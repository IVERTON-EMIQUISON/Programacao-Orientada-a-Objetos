import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n1, n2;

        System.out.print("n1: ");
        n1 = sc.nextInt();
        System.out.print("n2: ");
        n2 = sc.nextInt();

        System.out.println("O maior numero eh: " + ((n1 > n2)? n1 : n2));
        System.out.println("O menor numero eh: " + ((n1 < n2)? n1 : n2));

        sc.close();
    }
}