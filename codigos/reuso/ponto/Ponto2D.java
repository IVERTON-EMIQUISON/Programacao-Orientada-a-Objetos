public class Ponto2D {
    private double x;
    private double y;
    
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }        
}
