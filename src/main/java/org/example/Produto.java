package org.example;

public  class Produto extends Conteudo {
    private String nomeProduto;

    public Produto(String descricao, String nomeProduto) {
        super(descricao);
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setCargaHoraria(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getConteudo() {
        return "Caixa: " + this.getDescricao() + " - Produto: " + this.nomeProduto + "\n";
    }

}
