package com.ifpe.edu.br.web2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dataEntrega")
    private Date dataEntrega;
    @Column(name = "observacao", length = 1000)
    private String observacao;

    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "orgao_donatario_id", nullable = false)
    private OrgaoDonatario orgaoDonatario;
    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "orgao_fiscalizador_id", nullable = false)
    private OrgaoFiscalizador orgaoFiscalizador;
    @OneToMany(mappedBy = "lote", orphanRemoval = true)
    private List<Produto> produtoes = new ArrayList<>();

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

    public OrgaoDonatario getOrgaoDonatario() {
        return orgaoDonatario;
    }

    public void setOrgaoDonatario(OrgaoDonatario orgaoDonatario) {
        this.orgaoDonatario = orgaoDonatario;
    }

    public OrgaoFiscalizador getOrgaoFiscalizador() {
        return orgaoFiscalizador;
    }

    public void setOrgaoFiscalizador(OrgaoFiscalizador orgaoFiscalizador) {
        this.orgaoFiscalizador = orgaoFiscalizador;
    }

    public List<Produto> getProdutoes() {
        return produtoes;
    }

    public void setProdutoes(List<Produto> produtoes) {
        this.produtoes = produtoes;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "id=" + id +
                ", dataEntrega=" + dataEntrega +
                ", observacao='" + observacao + '\'' +
                ", orgaoDonatario=" + orgaoDonatario +
                ", orgaoFiscalizador=" + orgaoFiscalizador +
                ", produtoes=" + produtoes +
                '}';
    }
}