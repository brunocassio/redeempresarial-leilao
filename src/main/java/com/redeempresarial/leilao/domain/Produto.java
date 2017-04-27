package com.redeempresarial.leilao.domain;

import com.fasterxml.jackson.annotation.JsonView;
import com.redeempresarial.leilao.view.View;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by brunocassio on 25/04/17.
 */
public class Produto implements Serializable {

    @JsonView(View.Summary.class)
    private String id;
    @JsonView(View.Summary.class)
    private String faixaHorario;
    @JsonView(View.Summary.class)
    private String programaDisponivel;
    @JsonView(View.Summary.class)
    private Double valorLiquido;
    @JsonView(View.Summary.class)
    private Double CPMTGT;
    @JsonView(View.Summary.class)
    private Integer afinidade;
    @JsonView(View.Summary.class)
    private Integer totalTelespec;
    @JsonView(View.Summary.class)
    private Integer totalTelespecTGT;
    @JsonView(View.Summary.class)
    private Double lanceCPM;
    @JsonView(View.Summary.class)
    private Double valorFinal = 0.0;
    @JsonView(View.Summary.class)
    private Double valorCliente = 0.0;
    @JsonView(View.Summary.class)
    private Double valorConcorrente;

    public Produto() {
    }

    public Produto(String faixaHorario, String programaDisponivel, Double valorLiquido, Double CPMTGT, Integer afinidade, Integer totalTelespec, Integer totalTelespecTGT, Double lanceCPM, Double valorConcorrente, Double valorFinal) {

        this.id = UUID.randomUUID().toString();
        this.faixaHorario = faixaHorario;
        this.programaDisponivel = programaDisponivel;
        this.valorLiquido = valorLiquido;
        this.CPMTGT = CPMTGT;
        this.afinidade = afinidade;
        this.totalTelespec = totalTelespec;
        this.totalTelespecTGT = totalTelespecTGT;
        this.lanceCPM = lanceCPM;
        this.valorConcorrente = valorConcorrente;
        this.valorFinal = valorFinal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFaixaHorario() {
        return faixaHorario;
    }

    public void setFaixaHorario(String faixaHorario) {
        this.faixaHorario = faixaHorario;
    }

    public String getProgramaDisponivel() {
        return programaDisponivel;
    }

    public void setProgramaDisponivel(String programaDisponivel) {
        this.programaDisponivel = programaDisponivel;
    }

    public Double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(Double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public Double getCPMTGT() {
        return CPMTGT;
    }

    public void setCPMTGT(Double CPMTGT) {
        this.CPMTGT = CPMTGT;
    }

    public Integer getAfinidade() {
        return afinidade;
    }

    public void setAfinidade(Integer afinidade) {
        this.afinidade = afinidade;
    }

    public Integer getTotalTelespec() {
        return totalTelespec;
    }

    public void setTotalTelespec(Integer totalTelespec) {
        this.totalTelespec = totalTelespec;
    }

    public Integer getTotalTelespecTGT() {
        return totalTelespecTGT;
    }

    public void setTotalTelespecTGT(Integer totalTelespecTGT) {
        this.totalTelespecTGT = totalTelespecTGT;
    }

    public Double getLanceCPM() {
        return lanceCPM;
    }

    public void setLanceCPM(Double lanceCPM) {
        this.lanceCPM = lanceCPM;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Double getValorCliente() {
        return valorCliente;
    }

    public void setValorCliente(Double valorCliente) {
        this.valorCliente = valorCliente;
    }

    public Double getValorConcorrente() {
        return valorConcorrente;
    }

    public void setValorConcorrente(Double valorConcorrente) {
        this.valorConcorrente = valorConcorrente;
    }
}
