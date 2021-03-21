package com.br.zup.Equacao.services;

import com.br.zup.Equacao.models.CoeficientesEquacao;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;


@Service
public class EquacaoService {

    public BigDecimal calcularEquacao(CoeficientesEquacao grau){

        BigDecimal respostaX1 = grau.getA().multiply(new BigDecimal("2"));   //ax²
        BigDecimal respostaB = grau.getB();  // +bx
        BigDecimal respostaC = grau.getC();  // +c
        BigDecimal respostaX = respostaX1.add(respostaB);

        return respostaC.add(respostaX);

    }
}