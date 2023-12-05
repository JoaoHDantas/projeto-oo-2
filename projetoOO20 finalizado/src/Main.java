import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Barbearia barbearia = new Barbearia("Buffu's", "Rua Pes2019,21");
        
        barbearia.adicionarBarbeiro("joao", 18, 12);
        barbearia.acharbarbeiro("joao").adicionarCliente("ester", 19);

        System.out.println("Bem vindo a Barbearia "+barbearia.getNome());

        while (true) {
            System.out.println("");
            System.out.println("==============================================");
            System.out.println("1 para cadastrar o barbeiro");
            System.out.println("2 para cadstrar o cliente");
            System.out.println("3 para visualizar os clientes do barbeiro");
            System.out.println("4 para visualizar a lista dos barbeiros");
            System.out.println("5 para agendar horário/selecionar serviço");
            System.out.println("6 para mostrar o resumo do pedido");
            System.out.println("0 para encerrar");
            System.out.println("==============================================");
            int num = input.nextInt();
            input.nextLine();
            switch (num) {
                    case 1:
                        System.out.println("Digite o nome do barbeiro para cadastrar: ");
                        String nomeBarbeiro = input.nextLine();
                        System.out.println("Idade do Barbeiro: ");
                        int idade = input.nextInt();
                        System.out.println("Horário que o barbeiro estará disponivel:");
                        int horario = input.nextInt();

                        //Add barbeiro
                        barbearia.adicionarBarbeiro(nomeBarbeiro, idade, horario);
                        break;

                    case 2:
                        System.out.println("Digite o nome do Cliente que deseja cadastrar: ");
                        String nomeCliente = input.nextLine();
                        System.out.println("Digite o nome do barbeiro que você deseja: ");
                        String nomeBarbeiroAddC = input.nextLine();

                        //Add cliente, via metodo achar barbeiro
                        barbearia.acharbarbeiro(nomeBarbeiroAddC).adicionarCliente(nomeCliente, 18);
                        break;

                    case 3:
                        System.out.println("Digite o nome do seu Barbeiro: ");
                        String nomeAcharBarbeiro = input.nextLine();

                        barbearia.acharbarbeiro(nomeAcharBarbeiro).mostrarClientesBarbeiro();
                        break;

                    case 4:
                        barbearia.listarbarbeiros();
                        break;
                        
                    case 5:
                        System.out.println("Digite o nome do Barbeiro que deseja agendar horario: ");
                        String nomeBarbeiroAGH = input.nextLine();
                        System.out.println("Digite o nome do Cliente que deseja agendar: ");
                        String nomeClienteAGH = input.nextLine();
                        System.out.println("Digite o horario que você deseja agendar o serviço: ");
                        int horarioC = input.nextInt();

                        //Agendando horario via metodo achar barbeiro
                        barbearia.acharbarbeiro(nomeBarbeiroAGH).agendarHorario(nomeClienteAGH, horarioC);
                        break; 

                     case 6:
                        System.out.println("Diga o nome do Cliente que deseja ver a info do serviço;");
                        String nomeClienteinfo = input.nextLine();

                        //informaçoes do cliente
                        barbearia.infocliente(nomeClienteinfo);
                        break;

                    case 0:
                        break;
                    default:
                        break;
                }
                
        }
        
    }
}
