package Exercicios.hospital;

import java.util.ArrayList;

public class Paciente extends Pessoa{
    private String numeroProntuario;
    private Boolean convenio;

    public Paciente(String nome, String cpf, String dataNascimento, String telefone,
                    String numeroProntuario, Boolean convenio) {
        super(nome, cpf, dataNascimento, telefone);
        this.numeroProntuario = numeroProntuario;
        this.convenio = convenio;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("""
                Numero do prontuario: %s
                Convênio: %s
                """.formatted(numeroProntuario, convenio ? "Possui" : "Não possui"));
    }

    public String getNumeroProntuario() {
        return numeroProntuario;
    }
}
