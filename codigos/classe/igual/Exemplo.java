public class Exemplo {
    public static void main(String[] args) {
        final String IGUAL =  "igual";
        final String DIFERENTE =  "diferente";
        String str1 = "Brasil";
        String str2 = "Brasil";
        String str3 = "Argentina";
        Integer int1 = 5;
        Integer int2 = 5;
        Integer int3 = 10;

        System.out.println("str1 eh " + (ehIgual(str1, str2) ? IGUAL : DIFERENTE) + " de str2");
        System.out.println("str1 eh " + (ehIgual(str1, str3) ? IGUAL : DIFERENTE) + " de str3");
        System.out.println("int1 eh " + (ehIgual(int1, int2) ? IGUAL : DIFERENTE) + " de int2");
        System.out.println("int1 eh " + (ehIgual(int1, int3) ? IGUAL : DIFERENTE) + " de int3");
    }

    public static <T> boolean ehIgual(T obj1, T obj2) {
        return obj1.equals(obj2);
    }
}