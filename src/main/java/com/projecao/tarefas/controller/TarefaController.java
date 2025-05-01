package com.projecao.tarefas.controller;

import com.projecao.tarefas.model.Tarefa;
import com.projecao.tarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping
    public List<Tarefa> listar() {
        return tarefaRepository.findAll();
    }

    @PostMapping
    public Tarefa salvar(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }
}
