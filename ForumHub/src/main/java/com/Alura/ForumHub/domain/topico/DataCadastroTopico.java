package com.Alura.ForumHub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataCadastroTopico(

        @NotNull
        @NotBlank
        Integer id,

        @NotBlank
        String titulo,

        String mensagem,

        @NotBlank
        String dt_criacao,

        @NotBlank
        String estado_topico,

        @NotBlank
        String autor,

        String curso

) {
}
