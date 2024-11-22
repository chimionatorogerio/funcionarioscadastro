package com.chimionato.funcionarioscadastro.funcionario.application.repository;

import com.chimionato.funcionarioscadastro.funcionario.domain.Funcionario;

import java.util.List;

public interface FuncionarioRepository {
    Funcionario postFuncionario(Funcionario funcionario);
    List<Funcionario> getTodosFuncionarios();
}
