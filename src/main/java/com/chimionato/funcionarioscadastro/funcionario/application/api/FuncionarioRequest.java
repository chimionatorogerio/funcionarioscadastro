package com.chimionato.funcionarioscadastro.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FuncionarioRequest {
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String designacao;
    @NotBlank
    private String salario;
    @NotBlank
    private String telefone;
    @NotBlank
    private String endereco;
}