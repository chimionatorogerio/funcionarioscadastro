package com.chimionato.funcionarioscadastro.funcionario.infra;

import com.chimionato.funcionarioscadastro.funcionario.application.repository.FuncionarioRepository;
import com.chimionato.funcionarioscadastro.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {

    private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;

    @Override
    public Funcionario postFuncionario(Funcionario funcionario) {
        log.info("[inicia]   - FuncionarioInfraRepository - postFuncionario");
        funcionarioSpringDataJPARepository.save(funcionario);
        log.info("[FINALIZA] - FuncionarioInfraRepository - postFuncionario");
        return funcionario;
    }

    @Override
    public List<Funcionario> getTodosFuncionarios() {
        log.info("[inicia]   - FuncionarioInfraRepository - getTodosFuncionarios");
        List<Funcionario> todosFuncionarios = funcionarioSpringDataJPARepository.findAll();
        log.info("[FINALIZA] - FuncionarioInfraRepository - getTodosFuncionarios");
        return todosFuncionarios;
    }
}
