package Exercicios.hospital;

import java.time.LocalDateTime;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private LocalDateTime data;
    private String diagnostico;

    public Consulta(Medico medico, Paciente paciente) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = LocalDateTime.now();
    }

    public void registrarDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void exibirResumo() {
        System.out.println("------- Consulta -------");
        System.out.println("Data: " + data);
        System.out.println("--- Médico ---");
        medico.exibirDados();
        System.out.println("--- Paciente ---");
        paciente.exibirDados();
        if (diagnostico != null) {
            System.out.println("Diagnóstico: " + diagnostico);
        } else {
            System.out.println("Não há diagnóstico pronto.");
        }
    }

}
