public class Carro extends Terrestre{
    private String placa;

    public void moverFrente() {
        System.out.println("Carro movendo para frente");
    }

    // Comente o metodo abaixo para utilizar a implementacao do metodo toString da classe Object
   @Override
   public String toString() {
       return "Carro [capacidade=" + capacidade + ", placa=" + placa + ", qtdRodas=" + qtdRodas + "]";
   }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Carro(int capacidade, int qtdRodas, String placa) {
        super(capacidade, qtdRodas);
        this.placa = placa;
    }

    public Carro(String placa) {
        super(5, 4);
        this.placa = placa;
    }
}
