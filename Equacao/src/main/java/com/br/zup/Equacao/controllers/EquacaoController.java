package com.br.zup.Equacao.controllers;

import com.br.zup.Equacao.models.CoeficientesEquacao;
import com.br.zup.Equacao.services.EquacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
@RequestMapping("equacao/")
public class EquacaoController {

    @Autowired
    public EquacaoService equacaoService;

    @PostMapping
    public String calcularEquacao(@RequestBody @Valid CoeficientesEquacao grau){
        return grau.toString();
    }
}