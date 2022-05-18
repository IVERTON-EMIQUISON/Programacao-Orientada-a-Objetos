public abstract class Veiculo {
    protected int capacidade;

    public abstract void moverFrente();

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }
}