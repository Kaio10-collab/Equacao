package com.br.zup.Equacao.dto;

import java.math.BigDecimal;

public class SaidaEquacaoDTO {
    private BigDecimal x1;
    private BigDecimal x2;

    public SaidaEquacaoDTO() {
    }

    public BigDecimal getX1() {
        return x1;
    }

    public void setX1(BigDecimal x1) {
        this.x1 = x1;
    }

    public BigDecimal getX2() {
        return x2;
    }

    public void setX2(BigDecimal x2) {
        this.x2 = x2;
    }
}