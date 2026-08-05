package Exercicios.banco;

import com.sun.jdi.DoubleValue;

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

    public void depositar(Double valor) {
        if(valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("valor precisa ser maior que 0 para fazer o deposito. Tente novamente!");
        }
    }

    public void saque(Double valor) {
        if(this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Algo deu errado com o saque, tente novamente!");
        }
    }
}
