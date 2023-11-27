// Serviço Barbearia

public class Main {
    public static void main(String[] args) throws Exception {

        Barbearia barbearia = new Barbearia("Joao's barbearia", "Rua lalala");
        Cliente c1 = new Cliente("joao", 18);
        Cliente c2 = new Cliente("asda", 42);
        Barbeiro b1 = new Barbeiro("pedro", "dasda", 10.1);
        Barbeiro b2 = new Barbeiro("hahahah", "dasda", 7.0);
        barbearia.adicionarBarbeiro(b1);
        
        
        // barbearia.listarBarbeiros();

        barbearia.agendarHorario(c1,11.0, b1);
        barbearia.agendarHorario(c2,8.0, b2);
        barbearia.mostrarAgendamento();
        barbearia.cancelarHorario("asda");
        barbearia.mostrarAgendamento();

    }  
}
