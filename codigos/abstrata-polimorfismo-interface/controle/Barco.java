public class Barco extends Aquatico{
    private String cadBarco;

    public void moverFrente() {
        System.out.println("Barco movendo para frente");
    }

    @Override
    public String toString() {
        return "Barco [cadBarco=" + cadBarco + ", capacidade=" + capacidade + ", profundidade=" + profundidade + "]";
    }

    public String getCadBarco() {
        return cadBarco;
    }

    public void setCadBarco(String cadBarco) {
        this.cadBarco = cadBarco;
    }

    public Barco(int capacidade, float profundidade, String cadBarco) {
        super(capacidade, profundidade);
        this.cadBarco = cadBarco;
    }
}