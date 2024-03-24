package org.example.prototype;

public class Produto implements Cloneable{

    private int codigo;
    private String nome;
    private Modelo modelo;


    public Produto(int codigo, String nome, Modelo modelo) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto produtoClone = (Produto) super.clone();
        produtoClone.modelo = (Modelo) produtoClone.modelo.clone();
        return produtoClone;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "código = " + codigo +
                ", nome ='" + nome + '\'' +
                ", Modelo =" + modelo +
                '}';
    }
}
