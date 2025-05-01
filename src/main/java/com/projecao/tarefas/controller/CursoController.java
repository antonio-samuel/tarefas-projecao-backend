package com.projecao.tarefas.controller;

import com.projecao.tarefas.model.Curso;
import com.projecao.tarefas.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    @PostMapping
    public Curso salvar(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }
}
