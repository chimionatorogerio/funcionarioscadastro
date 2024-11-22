package com.chimionato.funcionarioscadastro.funcionario.application.service;

import com.chimionato.funcionarioscadastro.funcionario.application.api.FuncionarioRequest;
import com.chimionato.funcionarioscadastro.funcionario.application.api.FuncionarioResponse;

public interface FuncionarioService {
    FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest);
}