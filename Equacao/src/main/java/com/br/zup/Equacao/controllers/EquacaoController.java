package com.br.zup.Equacao.controllers;

import com.br.zup.Equacao.dto.SaidaEquacaoDTO;
import com.br.zup.Equacao.models.CoeficientesEquacao;
import com.br.zup.Equacao.services.EquacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.math.BigDecimal;

@RestController
@RequestMapping("equacao/")
public class EquacaoController {

    @Autowired
    public EquacaoService equacaoService;

    @PostMapping
    public SaidaEquacaoDTO CoeficientesEquacao (@RequestBody @Valid CoeficientesEquacao grau){
        return equacaoService.calcularEquacao(grau);
    }
}