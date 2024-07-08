package com.Alura.ForumHub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DataAtualizarTopico(
        @NotNull
        Integer id,
        String titulo,
        String mensagem,
        String estado_topico,
        String autor

) {
}
