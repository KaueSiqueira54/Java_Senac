package Exercicios.banco;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Conta extends Cliente {

    private String cep;
    private String tipoConta;
    private int numeroConta;
    private int senhaConta;
    static ArrayList<Conta> contas = new ArrayList<Conta>();

    public Conta(String nome, String cpf, String cep, String tipoConta, int senhaConta) {
        super(nome, cpf);
        this.cep = cep;
        this.tipoConta = tipoConta;
        this.numeroConta = new SecureRandom().hashCode();
        this.senhaConta = senhaConta;
    }

    @Override
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
        int senhaConta;

        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine();

        System.out.println("Digite seu CPF: ");
        cpf = leitura.nextLine();

        System.out.println("Digite seu CEP: ");
        cep = leitura.nextLine();

        System.out.println("Digite o tipo de conta (PF/PJ): ");
        tipoConta = leitura.nextLine();

        System.out.println("Digite a senha para acesso da conta: (EX: 0000");
        senhaConta = leitura.nextInt();
        leitura.nextLine();

        try {
            contas.add(new Conta(nome, cpf, cep, tipoConta, senhaConta));
            System.out.println("Conta criada com sucesso!");
        } catch (Exception erro) {
            System.out.println("Algo deu errado, tente novamente!" + erro);
        }
    }

    public static void listarContas() {
        if (!contas.isEmpty()) {
            for (int i = 0; i < contas.size(); i++) {
                System.out.println("----------------------");
                System.out.printf("Titular da conta: %s %n", contas.get(i).getNome());
                System.out.printf("Tipo da conta: %s %n", contas.get(i).tipoConta);
                System.out.println("----------------------");
            }
        } else {
            System.out.println("Não existem contas criadas para listar. Tente criar uma!");
        }

    }

    public static void excluirConta() {
        Scanner leitura = new Scanner(System.in);
        int conta = 0;

        mostrarContas();

        System.out.println("Digite a conta que deseja excluir: (EX: 1)");
        conta = leitura.nextInt();
        leitura.nextLine();

        try {
            contas.remove(conta);
            System.out.println("Conta excluida com sucesso!");
        } catch (IndexOutOfBoundsException erro) {
            System.out.println("O número digitado não corresponde a uma conta, tente novamente!");
        } catch (Exception erro) {
            System.out.println("Algo deu errado, tente novamente! Erro: " + erro);
        }
    }

    public static void atualizarDados() {
        Scanner leitura = new Scanner(System.in);
        int conta = 0;
        int dadoAtualizar = 0;
        String nomeAtualizar, cepAtualizar;
        int senhaContaAtualizar;

        mostrarContas();

        System.out.println("Digite a conta que deseja atualizar: (EX: 1)");
        conta = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Qual dado desta conta deseja atualizar?");
        System.out.println("""
                1 - Nome
                2 - CEP
                3 - Senha
                """);
        dadoAtualizar = leitura.nextInt();
        leitura.nextLine();

        if(dadoAtualizar == 1) {
            System.out.println("Digite o novo nome: ");
            nomeAtualizar = leitura.nextLine();

            contas.get(conta).setNome(nomeAtualizar);
            System.out.println("Nome atualizado com sucesso!");
        } else if(dadoAtualizar == 2) {
            System.out.println("Digite o novo CEP: ");
            cepAtualizar = leitura.nextLine();

            contas.get(conta).setCep(cepAtualizar);
            System.out.println("CEP atualizado com sucesso!");
        } else if(dadoAtualizar == 3) {
            System.out.println("Digite a nova senha (EX: 0000): ");
            senhaContaAtualizar = leitura.nextInt();
            leitura.nextLine();

            contas.get(conta).setSenhaConta(senhaContaAtualizar);
            System.out.println("Senha atualizada com sucesso!");
        } else {
            System.out.println("Opção inválida! Tente novamente");
        }
    }

    public static void acessarConta() {
        Scanner leitura = new Scanner(System.in);
        int conta = 0;
        int senhaConta;

        for (int i = 0; i < contas.size(); i++) {
            System.out.println("----------------");
            System.out.println("Conta %d".formatted(i));
            System.out.println("Titular: %s".formatted(contas.get(i).getNome()));
            System.out.println("Tipo da conta: %s".formatted(contas.get(i).tipoConta));
            System.out.println("----------------");
        }

        System.out.println("Qual conta deseja acessar? (EX: 1)");
        conta = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Digite a senha da conta: ");
        senhaConta = leitura.nextInt();
        leitura.nextLine();

        try {
            if (contas.get(conta).senhaConta == senhaConta) {
                System.out.println("Conta acessada com sucesso");

                int opcao = 0;

                while (opcao != 5) {
                System.out.println("""
                1 - Informações da conta
                2 - Depósito
                3 - Saque
                4 - Atualizar dados
                5 - Sair
                """);

                opcao = leitura.nextInt();
                leitura.nextLine();

                    switch (opcao) {
                        case 1:
                            contas.get(conta).info();
                            break;
                        case 2:
                            Double valorDeposito;

                            System.out.println("Digite o valor para o depósito: ");
                            valorDeposito = leitura.nextDouble();
                            leitura.nextLine();

                            try {
                                contas.get(conta).depositar(valorDeposito);
                                System.out.println("Depósito realizado com sucesso!");
                            } catch (Exception erro) {
                                System.out.println("Algo deu errado, tente novamente! " + erro);
                            }
                            break;
                        case 3:
                            Double valorSaque;

                            System.out.println("Digite o valor para o saque: ");
                            valorSaque = leitura.nextDouble();
                            leitura.nextLine();

                            try {
                                contas.get(conta).saque(valorSaque);
                            } catch (Exception erro) {
                                System.out.println("Algo deu errado, tente novamente! " + erro);
                            }
                            break;
                        case 4:
                            atualizarDados();
                            break;
                    }
                }
            } else {
                System.out.println("Senha incorreta, tente novamente!");
            }
        } catch (IndexOutOfBoundsException erro) {
            System.out.println("A conta digitada para acesso não existe. Tente novamente!" + erro.toString());
        }
    }

    public static void mostrarContas() {
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("----------------");
            System.out.println("Conta %d".formatted(i));
            System.out.println("----------------");
            System.out.println("Titular: %s".formatted(contas.get(i).getNome()));
            System.out.println("Tipo da conta: %s".formatted(contas.get(i).tipoConta));
            System.out.println("----------------");
        }
    }

    //sets

    private void setCep(String cep) {
        this.cep = cep;
    }
    private void setSenhaConta(int senhaConta) {
        this.senhaConta = senhaConta;
    }
}