package com.chimionato.funcionarioscadastro.funcionario.application.service;

import com.chimionato.funcionarioscadastro.funcionario.application.api.FuncionarioRequest;
import com.chimionato.funcionarioscadastro.funcionario.application.api.FuncionarioResponse;
import com.chimionato.funcionarioscadastro.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {

    @Override
    public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia]   - FuncionarioApplicationService - postFuncionario");
        Funcionario funcionario = funcionarioRepository.postFuncionario(new Funcionario(funcionarioRequest));
        log.info("[FINALIZA] - FuncionarioApplicationService - postFuncionario");
        return FuncionarioResponse.builder()
                .idFuncionario(funcionario.getIdFuncionario())
                .build();
    }
}