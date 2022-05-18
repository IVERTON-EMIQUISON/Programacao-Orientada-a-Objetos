public class Controle {
    private Veiculo veiculo;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Controle(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Controle() {
    }

    public void controlar() {
        veiculo.moverFrente();
    }
}