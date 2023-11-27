public class Agendamento {
    private Cliente cliente;
    private Barbeiro barbeiro;
    private boolean presente;

    public Agendamento(Cliente cliente, Barbeiro barbeiro) {
        this.cliente = cliente;
        this.barbeiro = barbeiro;
        this.presente = false; // Por padrão, inicializa como não presente
    }

    public void confirmarPresenca() {
        this.presente = true;
    }

    public boolean estáPresente() {
        return presente;
    }

    // Getters e setters
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barbeiro getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(Barbeiro barbeiro) {
        this.barbeiro = barbeiro;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }


    
}
