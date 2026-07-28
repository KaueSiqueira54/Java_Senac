package heranca;

public class Principal {
    public static void main(String[] args) {

        Carro c1 = new Carro("Gol");
        Carro c2 = new Carro("HRV");

        CarroCombate c3 = new CarroCombate("Leo", 50);
        CarroCombate c4 = new CarroCombate("Batman", 100);
        c3.Atirar();
        c3.Atirar();
        c3.Atirar();

        c1.setLigado(true);
        c1.Info();
        c3.Info();
        c3.Info();
        c4.Info();


    }
}
