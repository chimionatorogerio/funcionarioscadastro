package com.chimionato.funcionarioscadastro.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String designacao;
    private String salario;
    private String telefone;
    private String endereco;
}