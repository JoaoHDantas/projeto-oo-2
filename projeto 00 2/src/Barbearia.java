import java.util.ArrayList;

public class Barbearia {
    private String nome;
    private String endereco;
    private ArrayList<Barbeiro> listaBarbeiros;
    private ArrayList<Agendamento> listaAgendamentos;

   
    public Barbearia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.listaBarbeiros = new ArrayList<>();
        this.listaAgendamentos = new ArrayList<>();
    }
    public void listarBarbeiros(){
        for (Barbeiro i : listaBarbeiros){
            System.out.println(i.getNome()+i.getHorario());
        }
    }

    public void adicionarBarbeiro(Barbeiro barbeiro) {
        listaBarbeiros.add(barbeiro);
    }

    public boolean agendarHorario(Cliente cliente, double horarioCliente,  Barbeiro barbeiro) {
        Agendamento novoAgendamento = new Agendamento(cliente, barbeiro);
        if (horarioCliente > barbeiro.getHorario()){
            // Escolhendo serviço pelo nome
            escolherservico("joao");
            // adicionando cliente na lista agendamento
            listaAgendamentos.add(novoAgendamento);
            System.out.println("Agendamento bem sucedido");
            return true;
        }else{
            System.out.println("Agendamento mal-sucedido");
            return false;
        }
    }


    public void escolherservico(String nome){

        for(Agendamento i : listaAgendamentos){
            if (nome.equals(i.getCliente().getNome())){

                int num = 1;
                System.out.println("Qual serviço voce deseja fazer\n 1- Cortar cabelo\n 2- Fazer barba\n 3- Fazer sobrancelha\n 4- Pintar cabelo");
                
                switch (num) {
                    case 1:
                    i.getCliente().cortarCabelo();
                    break;
                    case 2:
                    i.getCliente().fazerBarba();
                    break;
                    case 3:
                    i.getCliente().fazerSobrancelha();
                    break;
                    case 4:
                    i.getCliente().pintarCabelo();
                    break;
                    default:
                    break;
                }
            }else{
                System.out.println("Não exite ninguem com esse nome (Escolher serviço)");
            }
        }
    }


    

    Agendamento aux;
    public void cancelarHorario(String nome) {
        for(Agendamento i : listaAgendamentos){
            if (nome.equals(i.getCliente().getNome())){
                System.out.println("O agendamento foi removido");
                aux = i;
            }
        }

        listaAgendamentos.remove(aux);
    }



    public void mostrarAgendamento(){
        for (Agendamento i : listaAgendamentos){
            System.out.println("Cliente: "+i.getCliente().getNome()+" Agendou Horario com: "+i.getBarbeiro().getNome()+" Horario: "+i.getBarbeiro().getHorario());

        }
    }
    // Outros métodos como adicionarBarbeiro, removerBarbeiro, listarBarbeiros, validarPresenca, etc.
}
    
