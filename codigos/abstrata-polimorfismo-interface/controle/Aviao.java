public class Aviao extends Aereo {
    private String cadAviao;

    public void moverFrente() {
        System.out.println("Aviao movendo para frente");
    }

    @Override
    public String toString() {
        return "Aviao [cadANAC=" + cadANAC + ", cadAviao=" + cadAviao + ", capacidade=" + capacidade + "]";
    }

    public String getCadAviao() {
        return cadAviao;
    }

    public void setCadAviao(String cadAviao) {
        this.cadAviao = cadAviao;
    }

    public Aviao(int capacidade, String cadANAC, String cadAviao) {
        super(capacidade, cadANAC);
        this.cadAviao = cadAviao;
    }
}
