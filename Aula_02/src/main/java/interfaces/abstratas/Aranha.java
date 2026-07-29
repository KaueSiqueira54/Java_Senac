package interfaces.abstratas;

public class Aranha extends Animal{

    private int veneno;

    public Aranha(int velocidade, int massa, int forca, int veneno) {
            super(velocidade, massa, forca);
            this.veneno = veneno;
    }

    public void info() {
        super.info();
        System.out.println("veneno: %d".formatted(this.veneno));
    }

    //Sobrescreve o método atacar somente para o objeto Aranha
    @Override
    public void atacar(Animal animal) {
        if(super.getVivo()) {
            if(this.getForca() > animal.getForca()) {
                this.setForca(this.getForca() + animal.getMassa());
            }
            if ((this.getForca() + this.veneno) > animal.getForca()) {
//                this.setForca(this.getForca() + animal.getMassa());
                animal.setVivo(false);
            } else {
                this.setVivo(false);
            }
        } else {
            System.out.println("-------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode atacar.");
            System.out.println("-------------------------");
        }
    }

}
