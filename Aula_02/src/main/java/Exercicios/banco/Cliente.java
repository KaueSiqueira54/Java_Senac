package Exercicios.banco;

public class Cliente {
    private String nome;
    private Double saldo;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void info() {
        System.out.printf("""
                Nome: %s
                Cpf: %s
                Saldo: %s
                """, this.nome, this.cpf, this.saldo);
    }
}
