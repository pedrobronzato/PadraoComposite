package org.example;

public class Carga {
    private Conteudo carga;
    public void setCarga(Conteudo carga) {
        this.carga = carga;
    }

    public String getCarga() {
        if (this.carga == null) {
            throw new NullPointerException("Carga vazia");
        }
        return this.carga.getConteudo();
    }
}
