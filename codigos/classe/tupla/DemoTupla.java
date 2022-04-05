public class DemoTupla {
    public static void main(String[] args) {
        Tupla<Integer, String> t1 = new Tupla<>(5, "Brasil");
        Tupla<String, Double> t2 = new Tupla<>("UFERSA", 3.3);
        Tupla<Double, Integer> t3 = new Tupla<>(3.14, 1);

        System.out.println("(" + t1.getPrimeiro() + ", " + t1.getSegundo() + ")");
        System.out.println("(" + t2.getPrimeiro() + ", " + t2.getSegundo() + ")");
        System.out.println("(" + t3.getPrimeiro() + ", " + t3.getSegundo() + ")");
    }
}