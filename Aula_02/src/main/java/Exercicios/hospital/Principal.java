package Exercicios.hospital;

public class Principal {

    public static void main(String[] args) {
        Medico dr = new Medico("Dra. Ana Souza", "111.222.333-44", "10/05/1980",
                "(11) 99999-0000", "CRM12345", "Cardiologia");

        Paciente pac = new Paciente("João Silva", "555.666.777-88", "20/03/1990",
                "(11) 98888-1111", "PRONT001", true);

        Consulta consulta = new Consulta(dr, pac);
        consulta.registrarDiagnostico("Pressão arterial controlada, retorno em 6 meses.");

        consulta.exibirResumo();
    }


}
