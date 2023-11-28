import java.util.ArrayList;

public class Barbearia {

    String nome;
    String endereco;
    private ArrayList<Barbeiro> Barbeiros;


    public Barbearia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.Barbeiros = new ArrayList<>();

    }


    public void adicionarBarbeiro(String nome, int idade, int horario) {
        Barbeiro novoBarbeiro = new Barbeiro(nome, idade, horario);
        Barbeiros.add(novoBarbeiro);
        System.out.println("");
        System.out.println("Adicionado novo barbeiro");
    }

    public Barbeiro acharbarbeiro(String nome){
        for(Barbeiro barbeiro : Barbeiros){
            if (nome.equals(barbeiro.getNome())) {
                return barbeiro;
            }
        }
        return null;
    }

    public void listarbarbeiros(){
        for(Barbeiro barbeiro : Barbeiros){
            System.out.println(barbeiro.getNome()+" Horario disponivel: "+barbeiro.getHorario());
        }

    }

    public boolean infocliente(String nome){
        for(Barbeiro barbeiro : Barbeiros){
            if (barbeiro.verificarSeExisteCliente(nome)) {
                System.out.println("Informaçoes do agendamento do cliente: "+barbeiro.acharCliente(nome).getNome());
                System.out.println("Nome: "+barbeiro.acharCliente(nome).getNome());
                System.out.println("Nome do barbeiro: "+barbeiro.getNome());
                System.out.println("Idade: "+barbeiro.acharCliente(nome).getIdade());
                System.out.println("Serviço desejado: "+barbeiro.acharCliente(nome).getServicoDesejado());
                System.out.println("*Cartão fidelidade* Serviços realizados "+barbeiro.acharCliente(nome).getServicosFeitos());
                if (barbeiro.acharCliente(nome).getServicosFeitos()>=3) {
                    System.out.println("========================\n"+"Cartão fidelidade aplicado\n"+"========================");
                    System.out.println("Valor retirado para a Barbearia "+
                ((barbeiro.acharCliente(nome).getValorASerPago()-5)*0.3)+" R$,30%\n"+
                "Valor retirado para o Barbeiro "+((barbeiro.acharCliente(nome).getValorASerPago()-5)-(barbeiro.acharCliente(nome).getValorASerPago()*0.3))+"R$\n"+
                "Valor a ser pago: "+(barbeiro.acharCliente(nome).getValorASerPago()-5)+"R$");
                    barbeiro.acharCliente(nome).setServicosFeitos(0);
                }else{
                    System.out.println("Valor retirado para a Barbearia: R$"+
                    (barbeiro.acharCliente(nome).getValorASerPago()*0.3)+" 30%\n"+
                    "Valor retirado para o Barbeiro: R$"+(barbeiro.acharCliente(nome).getValorASerPago()-(barbeiro.acharCliente(nome).getValorASerPago()*0.3))+"R$\n"+
                    "Valor a ser pago: R$"+barbeiro.acharCliente(nome).getValorASerPago());
                }

                return true;
                
            }else{
                System.out.println("Não existe ninguém com esse nome");
                return false;
            }
        }
        return false;
    }

    //Getter e Setter

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public ArrayList<Barbeiro> getBarbeiros() {
        return Barbeiros;
    }


    public void setBarbeiros(ArrayList<Barbeiro> barbeiros) {
        Barbeiros = barbeiros;
    }

    
}
