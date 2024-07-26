package com.crud_api.entity_crud_rest.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EstudanteCreateDTO {

    @NotBlank(message = "O Nome Deve Ser Informado")
    @Size(min = 2 , message = "O Nome Deve Conter No Minimo 2 Caracteres")
    String nome;

    @Min(value = 18, message = "O Aluno Deve Ter No Minimo 18 Anos De Idade")
    String idade;

    public @NotBlank(message = "O Nome Deve Ser Informado") @Size(min = 2, message = "O Nome Deve Conter No Minimo 2 Caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O Nome Deve Ser Informado") @Size(min = 2, message = "O Nome Deve Conter No Minimo 2 Caracteres") String nome) {
        this.nome = nome;
    }

    public @Min(value = 18, message = "O Aluno Deve Ter No Minimo 18 Anos De Idade") String getIdade() {
        return idade;
    }

    public void setIdade(@Min(value = 18, message = "O Aluno Deve Ter No Minimo 18 Anos De Idade") String idade) {
        this.idade = idade;
    }
}
