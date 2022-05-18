public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao(42, "AE123", "AV789");
        Barco barco = new Barco(20, 15.5f, "BAR597");
        Carro carro = new Carro(5, 4, "PLQ8F28");

        System.out.println(aviao.toString());
        aviao.moverFrente();
        System.out.println(barco.toString());
        barco.moverFrente();
        System.out.println(carro.toString());
        carro.moverFrente();
        
        Controle controle = new Controle();

        controle.setVeiculo(aviao);
        controle.controlar();
        controle.setVeiculo(barco);
        controle.controlar();
        controle.setVeiculo(carro);
        controle.controlar();
        
        // polimorfismo de sobrecarga
        Carro carro2 = new Carro("UF3RS4");
        
        // polimorfismo de sobreposicao
        System.out.println(carro2.toString());
    }
}
