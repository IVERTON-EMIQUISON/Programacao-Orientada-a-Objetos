import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xinf, yinf, xsup, ysup, px, py;

        System.out.print("xinf: ");
        xinf = sc.nextDouble();
        System.out.print("yinf: ");
        yinf = sc.nextDouble();
        System.out.print("xsup: ");
        xsup = sc.nextDouble();
        System.out.print("ysup: ");
        ysup = sc.nextDouble();
        System.out.print("px: ");
        px = sc.nextDouble();
        System.out.print("py: ");
        py = sc.nextDouble();

        if(px<xinf || px>xsup || py<yinf || py>ysup) {
            System.out.println("O ponto esta fora do retangulo");
        } else if(px>xinf && px<xsup && py>yinf && py<ysup) {
            System.out.println("O ponto esta dentro do retangulo");
        } else {
            System.out.println("O ponto esta na borda do retangulo");
        }
        
        sc.close();
    }
}