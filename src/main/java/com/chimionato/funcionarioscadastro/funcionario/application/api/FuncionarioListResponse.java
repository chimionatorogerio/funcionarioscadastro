package com.chimionato.funcionarioscadastro.funcionario.application.api;

import com.chimionato.funcionarioscadastro.funcionario.domain.Funcionario;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String designacao;
    private String salario;
    private String telefone;
    private String endereco;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .map(FuncionarioListResponse::new)
                .collect(Collectors.toList());
    }

    private FuncionarioListResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.designacao = funcionario.getDesignacao();
        this.salario = funcionario.getSalario();
        this.telefone = funcionario.getTelefone();
        this.endereco = funcionario.getEndereco();
    }
}