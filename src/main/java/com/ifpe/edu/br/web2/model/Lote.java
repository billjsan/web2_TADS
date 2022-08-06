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
    @Column(name = "observacao", length = 1000)
    private String observacao;

    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "orgao_donatario_id", nullable = false)
    private OrgaoDonatario orgaoDonatario;
    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "orgao_fiscalizador_id", nullable = false)
    private OrgaoFiscalizador orgaoFiscalizador;

    public Lote() {
    }

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

    @Override
    public String toString() {
        return "Lote{" +
                "id=" + id +
                ", dataEntrega=" + dataEntrega +
                ", observacao='" + observacao + '\'' +
                ", orgaoDonatario=" + orgaoDonatario +
                ", orgaoFiscalizador=" + orgaoFiscalizador +
                '}';
    }
}