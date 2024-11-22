package com.chimionato.funcionarioscadastro.funcionario.application.service;

import com.chimionato.funcionarioscadastro.funcionario.application.api.FuncionarioListResponse;
import com.chimionato.funcionarioscadastro.funcionario.application.api.FuncionarioRequest;
import com.chimionato.funcionarioscadastro.funcionario.application.api.FuncionarioResponse;
import com.chimionato.funcionarioscadastro.funcionario.application.repository.FuncionarioRepository;
import com.chimionato.funcionarioscadastro.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Override
    public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia]   - FuncionarioApplicationService - postFuncionario");
        Funcionario funcionario = funcionarioRepository.postFuncionario(new Funcionario(funcionarioRequest));
        log.info("[FINALIZA] - FuncionarioApplicationService - postFuncionario");
        return FuncionarioResponse.builder()
                .idFuncionario(funcionario.getIdFuncionario())
                .build();
    }

    @Override
    public List<FuncionarioListResponse> getTodosFuncionarios() {
        log.info("[inicia]   - FuncionarioApplicationService - getTodosFuncionarios");
        List<Funcionario> funcionarios = funcionarioRepository.getTodosFuncionarios();
        log.info("[FINALIZA] - FuncionarioApplicationService - getTodosFuncionarios");
        return FuncionarioListResponse.converte(funcionarios);
    }
}