import java.util.Scanner;

public class Cliente extends Pessoa {

    private String servicoDesejado;
    private double valorASerPago;
    private int servicosFeitos;

    //Scanner para receber o numero do pedido
    Scanner input = new Scanner(System.in);

    public Cliente(String nome, int idade) {
        super(nome, idade);
    }

    // Getter e Setter
    
    public String getServicoDesejado() {
        return servicoDesejado;
    }
    
    public void setServicosFeitos(int servicosFeitos) {
        this.servicosFeitos = servicosFeitos;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public int getServicosFeitos() {
        return servicosFeitos;
    }

    public void setServicoDesejado(String servicoDesejado) {
        this.servicoDesejado = servicoDesejado;
    }
        

    //Metodo para selecionar serviço do cliente, 
    //onde contabiliza o preço do serviço e a quantidade de vezes que ele ja foi executado
    public void selecservico(){
        System.out.println("");
        System.out.println("Qual serviço voce deseja fazer\n 1- Cortar cabelo\n 2- Fazer barba\n 3- Fazer sobrancelha\n 4- Pintar cabelo");
        
        int num = input.nextInt();
        input.nextLine();
        switch (num) {
            case 1:
                System.out.println("Serviço marcado como: Cortar o cabelo");
                this.servicoDesejado = "Cortar cabelo";
                this.valorASerPago = 25.0;
                this.servicosFeitos += 1;

                break;

            case 2:
                System.out.println("Serviço marcado como: Fazer barba");
                this.servicoDesejado = "Fazer barba";
                this.valorASerPago = 20.0;
                this.servicosFeitos +=1;
                break;

            case 3:
                System.out.println("Serviço marcado como: Fazer a sobrancelha");
                this.servicoDesejado = "Fazer a sobrancelha";
                this.valorASerPago = 10.0;
                this.servicosFeitos +=1;
                break;

            case 4:
                System.out.println("Serviço marcado como: Pintar o cabelo");
                this.servicoDesejado = "Pintar o cabelo";
                this.valorASerPago = 40.0;
                this.servicosFeitos +=1;
                break;
            
            default:
                break;
        }
    }
    //Metodo para verificar cupom, 3 serviços feitos e igual ao desconto
    public boolean verificarCupom(){
        if (servicosFeitos >= 3) {
            return true;
        }else{
            return false;
        }
    }
    
    
}
