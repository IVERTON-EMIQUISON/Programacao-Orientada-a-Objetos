import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
		long fatorial;
        
        System.out.print("Numero: ");
        num = sc.nextInt();

        for(int val=0; val<=num; val++){
            fatorial = 1;
            for(long i=1; i<=val; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + val + " eh " + fatorial);  
        }
      
        sc.close();
    }
}