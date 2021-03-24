package com.br.zup.Equacao.services;

import com.br.zup.Equacao.dto.SaidaEquacaoDTO;
import com.br.zup.Equacao.models.CoeficientesEquacao;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.math.MathContext;

@Service
public class EquacaoService {

    public String calcularEquacao(CoeficientesEquacao grau) {
        MathContext mc = new MathContext(10);

        BigDecimal delta = grau.getB().multiply(grau.getB()).subtract(new BigDecimal(4).multiply(grau.getA()).multiply(grau.getB()));
        BigDecimal raizQuadradaDelta = delta.sqrt(mc);
        BigDecimal divisor = new BigDecimal(2).multiply(grau.getA());
        BigDecimal x1 = (grau.getB().multiply(new BigDecimal(-1).add(raizQuadradaDelta))).divide(divisor);
        BigDecimal x2 = (grau.getB().multiply(new BigDecimal(-1).subtract(raizQuadradaDelta))).divide(divisor);

        SaidaEquacaoDTO ObjEquacao = new SaidaEquacaoDTO();
        return calcularEquacao(grau);

    }
}