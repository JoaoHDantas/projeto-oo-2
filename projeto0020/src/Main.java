import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Barbearia barbearia = new Barbearia("Buffu's", "Rua Pes2019,21");
        
        barbearia.adicionarBarbeiro("joao", 18, 12);
        barbearia.acharbarbeiro("joao").adicionarCliente("ester", 19);

        System.out.println("Bem vindo a Barbearia "+barbearia.getNome());

        while (true) {
            System.out.println("==============================================");
            System.out.println("1 para adicionar o barbeiro");
            System.out.println("2 para adicionar o cliente");
            System.out.println("3 para mostrar os clientes do barbeiro");
            System.out.println("4 para mostrar a lista dos barbeiros");
            System.out.println("5 para Agendar horaio/selecionar serviço");
            System.out.println("6 para Mostrar o resumo do pedido");
            System.out.println("0 para finalizar o progama");
            System.out.println("==============================================");
            int num = input.nextInt();
            input.nextLine();
            switch (num) {
                    case 1:
                        System.out.println("Diga o nome do barbeiro que deseja adicionar");
                        String nomeBarbeiro = input.nextLine();
                        System.out.println("Idade do Barbeiro");
                        int idade = input.nextInt();
                        System.out.println("Horario que o barbeiro estará disponivel");
                        int horario = input.nextInt();
                        barbearia.adicionarBarbeiro(nomeBarbeiro, idade, horario);
                        break;
                    case 2:
                        System.out.println("Diga o nome do Cliente que deseja adicionar");
                        String nomeCliente = input.nextLine();
                        System.out.println("Diga o nome do seu Barbeiro");
                        String nomeBarbeiroAddC = input.nextLine();
                        barbearia.acharbarbeiro(nomeBarbeiroAddC).adicionarCliente(nomeCliente, 18);
                        break;
                    case 3:
                        System.out.println("Diga o nome do seu Barbeiro");
                        String nomeAcharBarbeiro = input.nextLine();
                        barbearia.acharbarbeiro(nomeAcharBarbeiro).mostrarClientesBarbeiro();
                        break;
                    case 4:
                        barbearia.listarbarbeiros();
                        break;
                        
                    case 5:
                        System.out.println("Diga o nome do Barbeiro que deseja Marcar horario");
                        String nomeBarbeiroAGH = input.nextLine();
                        System.out.println("Diga o nome do Cliente que deseja adicionar");
                        String nomeClienteAGH = input.nextLine();
                        System.out.println("Diga o horario que deseja agendar o serviço");
                        int horarioC = input.nextInt();
                        barbearia.acharbarbeiro(nomeBarbeiroAGH).agendarHorario(nomeClienteAGH, horarioC);
                        break;
                    case 6:
                        System.out.println("Diga o nome do Cliente que deseja ver a info do serviço;");
                        String nomeClienteinfo = input.nextLine();
                        barbearia.infocliente(nomeClienteinfo);
                    default:
                        break;
                }
                
        }
        
    }
}
