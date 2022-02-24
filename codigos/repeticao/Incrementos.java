public class Incrementos {
    public static void main(String[] args) {
        int a = 5;
        int b = 5 + a++;
        System.out.println("a = " + a  + " b = " + b);

        int c = 5;
        int d = 5 + ++c;
        System.out.println("c = " + c  + " d = " + d);
    }
}