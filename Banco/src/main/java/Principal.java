import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        ArrayList clientes = new ArrayList();
        Scanner leitura = new Scanner(System.in);

        String nomeCompleto;
        String cpf;
        int senha;

        System.out.println("Digite seu nome completo: ");
        nomeCompleto = leitura.nextLine();

        System.out.println("Digite seu CPF:");
        cpf = leitura.nextLine();

        System.out.println("Digite sua senha (somente números): ");
        senha = leitura.nextInt();
        leitura.nextLine();
        int numeroConta = GerarNumeroConta();

        Cliente cliente = new Cliente(nomeCompleto, cpf, senha, numeroConta);
        System.out.println("""
                Cliente: %s
                Número da conta: %d
                """.formatted(cliente.getNomeCompleto(), cliente.getNumeroConta()));

    }

    private static int GerarNumeroConta() {
        int numeroConta = 0;
        numeroConta = new SecureRandom().hashCode();
        return numeroConta;
    }



}

