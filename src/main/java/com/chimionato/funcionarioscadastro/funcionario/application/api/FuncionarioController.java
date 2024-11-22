package com.chimionato.funcionarioscadastro.funcionario.application.api;

import com.chimionato.funcionarioscadastro.funcionario.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Override
    public List<FuncionarioListResponse> getTodosFuncionarios() {
        log.info("[inicia]     FuncionarioController - getTodosFuncionarios");
        List<FuncionarioListResponse> funcionarios = funcionarioService.getTodosFuncionarios();
        log.info("[FINALIZA]   FuncionarioController - getTodosFuncionarios");
        return funcionarios;
    }
}