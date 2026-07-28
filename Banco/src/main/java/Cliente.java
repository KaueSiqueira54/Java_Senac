import java.security.SecureRandom;
import java.util.Scanner;

public class Cliente {

    private String nomeCompleto;
    private String cpf;
    private int numeroConta;
    private int senhaConta;

    Scanner leitura = new Scanner(System.in);

    public Cliente(String nomeCompleto, String cpf, int senhaConta, int numeroConta) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.senhaConta = senhaConta;
        this.numeroConta = numeroConta;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
