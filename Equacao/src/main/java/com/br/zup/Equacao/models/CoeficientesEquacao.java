package com.br.zup.Equacao.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class CoeficientesEquacao {
    @NotNull
    private BigDecimal a;
    @NotNull
    private BigDecimal b;
    @NotNull
    private BigDecimal c;

    public CoeficientesEquacao(@NotNull BigDecimal a, @NotNull BigDecimal b, @NotNull BigDecimal c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "CoeficientesEquacaoRequest{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public BigDecimal getA() {
        return a;
    }

    public void setA(BigDecimal a) {
        this.a = a;
    }

    public BigDecimal getB() {
        return b;
    }

    public void setB(BigDecimal b) {
        this.b = b;
    }

    public BigDecimal getC() {
        return c;
    }

    public void setC(BigDecimal c) {
        this.c = c;
    }
}