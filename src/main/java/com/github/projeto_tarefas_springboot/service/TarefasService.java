package com.github.projeto_tarefas_springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.projeto_tarefas_springboot.model.Categoria;
import com.github.projeto_tarefas_springboot.model.Tarefas;
import com.github.projeto_tarefas_springboot.repository.CategoriaRepository;
import com.github.projeto_tarefas_springboot.repository.TarefasRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TarefasService {
    private final TarefasRepository tarefasRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;
    

    public List<Tarefas> listarTarefas() {
        return tarefasRepository.findAll();
    }

    public Tarefas salvarTarefas(Tarefas tarefas) {
        Long categoriaid = tarefas.getCategoria().getId();
        Categoria categoria = categoriaRepository.findById(categoriaid).orElseThrow();
        tarefas.setCategoria(categoria);
        return tarefasRepository.save(tarefas);
    }

    public Tarefas editarTarefas(Long id, Tarefas novaTarefas) {
        Tarefas tarefas = tarefasRepository.findById(id).orElseThrow();
        tarefas.setTitulo(novaTarefas.getTitulo());
        tarefas.setDescricao(novaTarefas.getDescricao());
        tarefas.setStatus(novaTarefas.getStatus());
        tarefas.setCategoria(novaTarefas.getCategoria());
        return tarefasRepository.save(tarefas);
    }

    public void deletarTarefas(Long id) {
        tarefasRepository.deleteById(id);
    }



}
