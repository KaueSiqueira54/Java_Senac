package interfaces.abstratas;

import interfaces.SerVivo;

public abstract class Animal implements SerVivo {

    private boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int velocidade;
    private int forca;

    public Animal(int velocidade, int massa, int forca) {
        this.vivo = true;
        this.velocidade = velocidade;
        this.massa = massa;
        this.x = 0;
        this.y = 0;
        this.forca = forca;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public Boolean getVivo() {
        return this.vivo;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getForca() {
        return this.forca;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getMassa() {
        return this.massa;
    }

    public void atacar(Animal animal) {
        if(this.vivo) {
            if(this.forca > animal.forca) {
                this.forca+= animal.getMassa();
            }
            else {
                this.vivo = false;
            }
        } else {
            System.out.println("-------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode atacar.");
            System.out.println("-------------------------");
        }
    }

    public void mover(){
        if(this.vivo) {
            this.x+= this.velocidade;
            this.y+= this.velocidade;
        } else {
            System.out.println("-------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode mover.");
            System.out.println("-------------------------");
        }
    }

    public void comer(int massa){
        if(this.vivo) {
            this.forca += massa;
        } else {
            System.out.println("-------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode comer.");
            System.out.println("-------------------------");
        }
    }

    public void info(){
        System.out.println("------------------------");
        System.out.println("Tipo: %s".formatted(getClass().toString()));
        System.out.println("Vivo: %s".formatted(this.getVivo() ? "Sim" : "Não"));
        System.out.println("Massa: %d".formatted(this.getMassa()));
        System.out.println("Velocidade: %d".formatted(this.velocidade));
        System.out.println("Força: %d".formatted(this.forca));
        System.out.println("------------------------");
    }
}
