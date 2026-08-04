package Exercicios.banco;

import java.util.ArrayList;
import java.util.Scanner;

import static Exercicios.banco.Conta.criarConta;
import static Exercicios.banco.Conta.listarContas;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Seja bem vindo!");
        System.out.println("""
                1 - Criar conta
                """);

        criarConta();
        listarContas();

    }



}
