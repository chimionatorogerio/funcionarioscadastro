package com.chimionato.funcionarioscadastro.funcionario.infra;

import com.chimionato.funcionarioscadastro.funcionario.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJPARepository extends JpaRepository<Funcionario, UUID> {
}