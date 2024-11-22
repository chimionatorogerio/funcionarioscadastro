package com.chimionato.funcionarioscadastro.funcionario.infra;

import com.chimionato.funcionarioscadastro.funcionario.application.repository.FuncionarioRepository;
import com.chimionato.funcionarioscadastro.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {

    private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

    @Override
    public Funcionario postFuncionario(Funcionario funcionario) {
        log.info("[inicia]   - FuncionarioInfraRepository - postFuncionario");
        clienteSpringDataJPARepository.save(funcionario);
        log.info("[FINALIZA] - FuncionarioInfraRepository - postFuncionario");
        return funcionario;
    }
}
