package com.Alura.ForumHub.controller;

import com.Alura.ForumHub.domain.topico.DataAtualizarTopico;
import com.Alura.ForumHub.domain.topico.DataCadastroTopico;
import com.Alura.ForumHub.domain.topico.Topico;
import com.Alura.ForumHub.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @GetMapping
    public List<Topico> listar(){
        return topicoRepository.findAll();
    }

    @PostMapping
    @Transactional
    public void topicoCadastrar(@RequestBody DataCadastroTopico data) {
        topicoRepository.save(new Topico(
                null,
                data.titulo(),
                data.mensagem(),
                data.dt_criacao(),
                data.estado_topico(),
                data.autor(),
                data.curso()
        ));
    };

    @PutMapping("/{id}")
    @Transactional
    public void topicoAtualizar(@PathVariable Integer id,@RequestBody DataAtualizarTopico data) {
        var topico = topicoRepository.getReferenceById(id);
        topico.atualizarData(data);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void topicoDeletar(@PathVariable Integer id, @RequestBody DataAtualizarTopico data) {
        topicoRepository.deleteById(id);

    }


}
