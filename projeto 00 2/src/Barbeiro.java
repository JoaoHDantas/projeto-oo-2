import java.util.List;

public class Barbeiro {
    private String nome;
    private String especialidade;
    private double horario;
    private List<Agendamento> agendamentos;
    

    
    public Barbeiro(String nome, String especialidade, double horario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.horario = horario;
    }
    // Getters e setters

    public List<Agendamento> verificarAgendamentos() {
        return agendamentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    
}
