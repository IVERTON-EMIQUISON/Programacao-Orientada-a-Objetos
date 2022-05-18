public abstract class Aereo extends Veiculo {
    protected String cadANAC;

    public String getCadANAC() {
        return cadANAC;
    }

    public void setCadANAC(String cadANAC) {
        this.cadANAC = cadANAC;
    }

    public Aereo(int capacidade, String cadANAC) {
        super(capacidade);
        this.cadANAC = cadANAC;
    }
}
