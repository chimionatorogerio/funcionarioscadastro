package com.chimionato.funcionarioscadastro.funcionario.application.repository;

import com.chimionato.funcionarioscadastro.funcionario.domain.Funcionario;

import java.util.List;
import java.util.UUID;

public interface FuncionarioRepository {
    Funcionario postFuncionario(Funcionario funcionario);
    List<Funcionario> getTodosFuncionarios();
    Funcionario getUmFuncionarioPeloId(UUID idFuncionario);
    void deletaUmFuncionarioPeloId(UUID idFuncionario);
}
