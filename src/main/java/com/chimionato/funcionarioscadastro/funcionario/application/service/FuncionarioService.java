package com.chimionato.funcionarioscadastro.funcionario.application.service;

import com.chimionato.funcionarioscadastro.funcionario.application.api.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {
    FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest);
    List<FuncionarioListResponse> getTodosFuncionarios();
    FuncionarioDetalhadoResponse getUmFuncionarioPeloId(UUID idFuncionario);
    void deletaUmFuncionarioPeloId(UUID idFuncionario);
    void patchAlteraFuncionario(UUID idFuncionario, @Valid FuncionarioAlteracaoRequest funcionarioAlteracaoRequest);
}