package interfaces.abstratas;

public class Vegetal {
    private Boolean vivo;
    private int massa;

    public Vegetal(int massa) {
        this.vivo = true;
        this.massa = massa;
    }

    public int getMassa() {
        return this.massa;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public void info(){
        System.out.println("------------------------");
        System.out.println("Tipo: %s".formatted(getClass().toString()));
        System.out.println("Vivo: %s".formatted(this.vivo ? "Sim" : "Não"));
        System.out.println("Massa: %d".formatted(this.getMassa()));
        System.out.println("------------------------");
    }

}
