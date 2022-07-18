package com.bill.ifpe.model;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long datahora;
    @Column
    private Double preco;
    @Column
    private String observacoes;

    public Pedido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDatahora() {
        return datahora;
    }

    public void setDatahora(Long datahora) {
        this.datahora = datahora;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", datahora=" + datahora +
                ", preco=" + preco +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
