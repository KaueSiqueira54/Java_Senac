public class TiposDeDados {

    //TIPOS PRIMITIVOS

    //Armazenam o valor direto na memória (Não são objetos)

    //byte	- byte idade = 25;
    //short	- short ano = 2026;
    //int - int quantidade = 100000;
    //long - long populacao = 8000000000L;


    //Números de ponto flutuante:

    //float	~6-7 dígitos decimais	float preco = 19.99f;
    //double ~15-16 dígitos decimais	double pi = 3.14159265;


    //caractere
    //char Um único caractere Unicode	char letra = 'A';


    //Lógico
    //boolean true ou false	boolean ativo = true;

    //Tabela Verdade AND
    // V V = V
    // V F = F
    // F V = F
    // F F = F

    // Tabela Verdade OR
    // V V = V
    // V F = V
    // F V = V
    // F F = F

    public static void main(String[] args) {
        byte idade = 25;
        short ano = 2026;
        int salario = 5000;
        long populacaoMundial = 8000000000L;

        float altura = 1.75f;
        double pi = 3.14159265;

        char inicial = 'J';
        boolean estudando = true;

        String nome = "João Silva";

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("Estudando: " + estudando);
    }
}
