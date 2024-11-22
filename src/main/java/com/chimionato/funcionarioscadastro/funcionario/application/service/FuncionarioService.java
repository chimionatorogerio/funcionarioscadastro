package com.chimionato.funcionarioscadastro.funcionario.application.service;

import com.chimionato.funcionarioscadastro.funcionario.domain.FuncionarioRequest;
import com.chimionato.funcionarioscadastro.funcionario.domain.FuncionarioResponse;

public interface FuncionarioService {
    FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest);
}