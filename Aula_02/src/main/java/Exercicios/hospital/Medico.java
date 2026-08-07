package Exercicios.hospital;

public class Medico extends Pessoa{

    private String crm;
    private String especialidade;

    public Medico(String nome, String cpf, String dataNascimento, String telefone, String crm, String especialidade) {
        super(nome, cpf, dataNascimento, telefone);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("""
                CRM: %s
                Especialidade: %s
                """, crm, especialidade);
    }
}
