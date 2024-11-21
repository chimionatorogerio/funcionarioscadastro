package com.chimionato.funcionarioscadastro.funcionario.domain;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class FuncionarioResponse {
    private UUID idFuncionario;
}