package org.example.prototype;

public class Modelo implements Cloneable {
    private String modelo;
    private Integer quantidade;

    public Modelo(String modelo, Integer quantidade) {
        this.modelo = modelo;
        this.quantidade = quantidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "modelo ='" + modelo + '\'' +
                ", Quantidade =" + quantidade +
                '}';
    }
}
