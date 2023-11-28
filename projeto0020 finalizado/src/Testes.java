import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Testes {
    @Test
    void testVerificarHorario() {
        Barbearia barbearia = new Barbearia("Barbearia buffus", "rua asokdj;al");
        barbearia.adicionarBarbeiro("joao", 18, 12);
        barbearia.acharbarbeiro("joao").adicionarCliente("ester", 19);

        assertEquals(true,barbearia.acharbarbeiro("joao").verificarHorario("ester", 13));
    }

    @Test
    void testVerificarSeExisteCliente() {
        Barbearia barbearia = new Barbearia("Barbearia buffus", "rua asokdj;al");
        barbearia.adicionarBarbeiro("joao", 18, 12);
        barbearia.acharbarbeiro("joao").adicionarCliente("ester", 19);

        assertEquals(true, barbearia.acharbarbeiro("joao").verificarSeExisteCliente("ester"));
    }

    @Test
    void testInfocliente() {
        Barbearia barbearia = new Barbearia("Barbearia buffus", "rua asokdj;al");
        barbearia.adicionarBarbeiro("joao", 18, 12);
        barbearia.acharbarbeiro("joao").adicionarCliente("ester", 19);

        assertEquals(true, barbearia.infocliente("ester"));
    }

    @Test
    void testVerificarCupom(){
        Barbearia barbearia = new Barbearia("Barbearia buffus", "rua asokdj;al");
        barbearia.adicionarBarbeiro("joao", 18, 12);
        barbearia.acharbarbeiro("joao").adicionarCliente("ester", 19);

        assertEquals(false, barbearia.acharbarbeiro("joao").acharCliente("ester").verificarCupom());
    }
}
