package com.Alura.ForumHub.domain.topico;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private String mensagem;
    private String dt_criacao;
    private String estado_topico;
    private String autor;
    private String curso;

    public void atualizarData(DataAtualizarTopico data) {

        if (data.titulo() != null) {
            this.titulo = data.titulo();
        }
        if (data.mensagem() != null) {
            this.mensagem = data.mensagem();
        }
        if (data.estado_topico() != null) {
            this.estado_topico = data.estado_topico();
        }
        if (data.autor() != null) {
            this.autor = data.autor();
        }


    }
}
