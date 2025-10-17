package com.github.projeto_tarefas_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.projeto_tarefas_springboot.model.Tarefas;

@Repository
public interface TarefasRepository  extends JpaRepository<Tarefas, Long> {}


