package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargaTest {

    @Test
    void deveRetornarEmentaDisciplina() {
        Caixa caixa1 = new Caixa("Caixa bic");

        Caixa caixa2 = new Caixa("Caixa mercado livre");
        Produto produto12 = new Produto("Artigos escolares", "Caneta");
        caixa1.addConteudo(produto12);

        Caixa caixa3 = new Caixa("Caixa kabum");
        Produto produto31 = new Produto("Artigos eletronicos", "Mouse");
        Produto produto42 = new Produto("Artigos eletronicos", "Teclado");
        caixa3.addConteudo(produto31);
        caixa3.addConteudo(produto42);

        Caixa caixa = new Caixa("Caixa correios");
        caixa.addConteudo(caixa1);
        caixa.addConteudo(caixa2);
        caixa.addConteudo(caixa3);

        Carga carga = new Carga();
        carga.setCarga(caixa);

        assertEquals("Caixa: Caixa correios\n" +
                "Caixa: Caixa bic\n" +
                "Caixa: Artigos escolares - Produto: Caneta\n" +
                "Caixa: Caixa mercado livre\n" +
                "Caixa: Caixa kabum\n" +
                "Caixa: Artigos eletronicos - Produto: Mouse\n" +
                "Caixa: Artigos eletronicos - Produto: Teclado\n", carga.getCarga());
    }

    @Test
    void deveRetornarExecacaoDisciplinaSemEmenta() {
        try {
            Carga carga = new Carga();
            carga.getCarga();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Carga vazia", e.getMessage());
        }
    }

}