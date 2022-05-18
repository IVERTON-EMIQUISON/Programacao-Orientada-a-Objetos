public abstract class Terrestre extends Veiculo{
    protected int qtdRodas;

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public Terrestre(int capacidade, int qtdRodas) {
        super(capacidade);
        this.qtdRodas = qtdRodas;
    }
}
