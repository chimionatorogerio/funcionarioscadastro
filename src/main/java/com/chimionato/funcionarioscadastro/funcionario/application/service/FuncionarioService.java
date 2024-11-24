package com.chimionato.funcionarioscadastro.funcionario.application.service;

import com.chimionato.funcionarioscadastro.funcionario.application.api.FuncionarioDetalhadoResponse;
import com.chimionato.funcionarioscadastro.funcionario.application.api.FuncionarioListResponse;
import com.chimionato.funcionarioscadastro.funcionario.application.api.FuncionarioRequest;
import com.chimionato.funcionarioscadastro.funcionario.application.api.FuncionarioResponse;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {
    FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest);
    List<FuncionarioListResponse> getTodosFuncionarios();
    FuncionarioDetalhadoResponse getUmFuncionarioPeloId(UUID idFuncionario);
    void deletaUmFuncionarioPeloId(UUID idFuncionario);
}