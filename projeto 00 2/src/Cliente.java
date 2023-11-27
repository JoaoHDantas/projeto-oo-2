public class Cliente {
    private String nome;
    private int idade;
    private String servicoEscolhido;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void cortarCabelo() {
        System.out.println(this.nome + " Ira cortar o cabelo");
        this.servicoEscolhido = "Cortar Cabelo";
    }
    
    public void fazerBarba() {
        System.out.println(this.nome + " Ira fazer a barba");
        this.servicoEscolhido = "Fazer a barba";
    }
    
    public void fazerSobrancelha() {
        System.out.println(this.nome + " Ira fazer a sobrancelha");
        this.servicoEscolhido = "Fazer a sobrancelha";
    }
    
    public void pintarCabelo() {
        System.out.println(this.nome + " Ira pintar o cabelo");
        this.servicoEscolhido = "Pintar o cabelo";
    }
    

    // Getters e setters
    public String getServicoEscolhido() {
        return servicoEscolhido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    
}
