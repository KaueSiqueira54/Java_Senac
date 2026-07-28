package heranca;

public class Carro {
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private boolean armamento;

    public Carro(String nome) {
        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
    }

    public String getNome() {
        return this.nome;
    }

    public Boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getDestruido() {
        return this.destruido;
    }

    public boolean getArmamento() {
        return this.armamento;
    }

    public void setArmamento(Boolean armamento) {
        this.armamento = armamento;
    }

    public int getBlindagem() {
        return this.blindagem;
    }

    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }

    public void SofrerDano(int dano) {
        this.blindagem-=dano;
        if(this.blindagem <= 0) {
            this.blindagem=0;
            this.ligado=false;
            this.destruido=false;
        }
    }

    public void Info() {
        System.out.println("-----------------------");
        System.out.println("Nome: %s".formatted(this.nome));
        System.out.println("Ligado: %s".formatted(this.ligado ? "Sim" : "Não"));
        System.out.println("Destruido: %s".formatted(this.destruido ? "Sim" : "Não"));
        System.out.println("Blindagem: %s".formatted(this.blindagem));
        System.out.println("Armamento: %s".formatted(this.armamento ? "Sim" : "Não"));
    }

}
