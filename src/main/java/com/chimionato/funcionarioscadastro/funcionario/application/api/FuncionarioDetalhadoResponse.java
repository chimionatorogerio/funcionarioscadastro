package com.chimionato.funcionarioscadastro.funcionario.application.api;

import jakarta.validation.Valid;

import java.util.UUID;

@Valid
public class FuncionarioDetalhadoResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String designacao;
    private String salario;
    private String telefone;
    private String endereco;
}