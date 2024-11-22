package com.chimionato.funcionarioscadastro.funcionario.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {

    private final FuncionarioService funcionarioService;

    @Override
    public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia]   FuncionarioController - postFuncionario");
        FuncionarioResponse funcionarioCriado = funcionarioService.postFuncionario(funcionarioRequest);
        log.info("[FINALIZA] FuncionarioController - postFuncionario");
        return funcionarioCriado;
    }
}