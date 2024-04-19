package br.com.fiap.checkpoint2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "profissionais")
public class Profissional extends AbstractEntity<Long>{
    @Column(nullable = false, length = 50, unique = true)
    private String nome;

    @Column(nullable = false, length = 50)
    private String especialidade;

    @Column(name = "valor_hora", columnDefinition = "NUMERIC(15,2)")
    private BigDecimal valorHora;

    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime createAt;

    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedeAt;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public BigDecimal getValorHora() {
        return valorHora;
    }

    public void setValorHora(BigDecimal valorHora) {
        this.valorHora = valorHora;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdatedeAt() {
        return updatedeAt;
    }

    public void setUpdatedeAt(LocalDateTime updatedeAt) {
        this.updatedeAt = updatedeAt;
    }
}
