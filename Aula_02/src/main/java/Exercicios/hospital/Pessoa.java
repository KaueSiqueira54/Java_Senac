package Exercicios.hospital;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected String telefone;

    public Pessoa(String nome, String cpf, String dataNascimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void exibirDados() {
        System.out.printf("""
                Nome: %s
                CPF: %s
                Data de Nascimento: %s
                Telefone: %s
                ---------------------
                """, nome, cpf, dataNascimento, telefone);
    }
}
