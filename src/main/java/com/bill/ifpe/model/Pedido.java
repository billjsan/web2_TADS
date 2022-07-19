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

    @ManyToOne
    @JoinColumn(name = "user_cpf")
    private User user;

    @ManyToOne
    @JoinColumn(name = "pagamento_id")
    private FormaPagamento pagamento;

    @ManyToOne
    @JoinColumn(name = "prato_id")
    private Prato prato;


    public Prato getPrato() {
        return prato;
    }

    public void setPrato(Prato prato) {
        this.prato = prato;
    }

    public FormaPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(FormaPagamento pagamento) {
        this.pagamento = pagamento;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


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