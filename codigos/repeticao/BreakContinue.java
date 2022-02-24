public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;
                // O restante da iteracao i=3 nao sera executado
            }
            if (i == 8) {
                break;
                // O laco eh encerrado
            } 
            System.out.println(i);            
        }
    }
}