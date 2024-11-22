package com.chimionato.funcionarioscadastro.funcionario.application.repository;

import com.chimionato.funcionarioscadastro.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
    Funcionario postFuncionario(Funcionario funcionario);
}
