package com.chimionato.funcionarioscadastro.funcionario.application.api;

import com.chimionato.funcionarioscadastro.funcionario.domain.Funcionario;
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

    public FuncionarioDetalhadoResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.designacao = funcionario.getDesignacao();
        this.salario = funcionario.getSalario();
        this.telefone = funcionario.getTelefone();
        this.endereco = funcionario.getEndereco();
    }
}