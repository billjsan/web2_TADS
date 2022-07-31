package com.ifpe.edu.br.web2.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dataEntrega")
    private Date dataEntrega;
    @Column(name = "observacao")
    private String observacao;

    public Lote() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "id=" + id +
                ", dataEntrega=" + dataEntrega +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
