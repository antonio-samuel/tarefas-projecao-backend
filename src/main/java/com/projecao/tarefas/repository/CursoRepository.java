package com.projecao.tarefas.repository;

import com.projecao.tarefas.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
