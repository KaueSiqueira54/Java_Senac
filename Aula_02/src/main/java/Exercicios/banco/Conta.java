package Exercicios.banco;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Conta extends Cliente{

    private String cep;
    private String tipoConta;
    private int numeroConta;
    static ArrayList<Conta> contas = new ArrayList<Conta>();

    public Conta(String nome, String cpf, String cep, String tipoConta) {
        super(nome, cpf);
        this.cep = cep;
        this.tipoConta = tipoConta;
        this.numeroConta = new SecureRandom().hashCode();
    }

    public void info() {
        super.info();
        System.out.printf("""
                -------------------
                Numero da conta: %d
                Tipo de conta: %s
                CEP: %s
                %n""", this.numeroConta, this.tipoConta, this.cep);
    }

    public static void criarConta() {
        Scanner leitura = new Scanner(System.in);

        String nome, cpf, cep, tipoConta;

        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine();

        System.out.println("Digite seu CPF: ");
        cpf = leitura.nextLine();

        System.out.println("Digite seu CEP: ");
        cep = leitura.nextLine();

        System.out.println("Digite o tipo de conta (PF/PJ): ");
        tipoConta = leitura.nextLine();

        contas.add(new Conta(nome, cpf, cep, tipoConta));
    }

    public static void listarContas() {
        for(int i=0; i < contas.size(); i++) {
            System.out.println("----------------------");
            System.out.printf("Titular da conta: %s %n",contas.get(i).getNome());
            System.out.printf("Tipo da conta: %s %n",contas.get(i).tipoConta);
            System.out.println("----------------------");
        }
    }
}
