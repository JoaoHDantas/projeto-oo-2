import java.util.ArrayList;

public class Barbeiro extends Pessoa {

    private ArrayList<Cliente> clientes;
    private int horario;

    public Barbeiro(String nome, int idade, int horario) {
        super(nome, idade);
        this.horario = horario;
        this.clientes = new ArrayList<>();
    }
    public void adicionarCliente(String nome, int idade) {
        Cliente novoCliente = new Cliente(nome, idade);
        clientes.add(novoCliente);
        System.out.println("Adicionado novo cliente");
    }

    //Metodo mostrar lista de clientes do barbeiro
    public void mostrarClientesBarbeiro(){
        System.out.println("O barbeiro "+ Barbeiro.super.getNome() +" Possui esses clientes:");
        for(Cliente cliente : clientes){
            System.out.println(cliente.getNome());
        }
    }

    public boolean verificarSeExisteCliente(String nome){
        for(Cliente cliente : clientes){
            if (nome.equals(cliente.getNome())) {
                return true;
            }
        }
        return false;
    }

    public Cliente acharCliente(String nome){
        for(Cliente cliente : clientes){
            if (nome.equals(cliente.getNome())) {
                return cliente;
            }
        }
        return null;
    }

    //fazer teste
    public boolean agendarHorario(String nomeDoCliente, int horarioCliente){
        if (horarioCliente >= this.horario && horarioCliente < 24) {
            System.out.println("Horario disponivel!!");
            acharCliente(nomeDoCliente).selecservico();
            return true;
        }else{
            System.out.println("Horario indisponivel");
            return false;
        }
        
    }

    public boolean verificarHorario(String nomeDoCliente, int horarioCliente){
        if (horarioCliente >= this.horario && horarioCliente < 24) {
            System.out.println("Horario disponivel!!");
            return true;
        }else{
            System.out.println("Horario indisponivel");
            return false;
        }
        
    }    

    
    // Getter e Setter
    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
    

}
