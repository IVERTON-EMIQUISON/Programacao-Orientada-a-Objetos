public abstract class Aquatico extends Veiculo {
    protected float profundidade;

    public float getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(float profundidade) {
        this.profundidade = profundidade;
    }

    public Aquatico(int capacidade, float profundidade) {
        super(capacidade);
        this.profundidade = profundidade;
    }
}
