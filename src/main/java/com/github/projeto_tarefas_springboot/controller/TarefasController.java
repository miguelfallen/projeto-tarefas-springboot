package com.github.projeto_tarefas_springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.projeto_tarefas_springboot.model.Tarefas;
import com.github.projeto_tarefas_springboot.service.TarefasService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tarefas")
@RequiredArgsConstructor
public class TarefasController {
    private final TarefasService tarefasService;

    @GetMapping
    public List<Tarefas> listarTarefas() {
        return tarefasService.listarTarefas();
    }

    @PostMapping
    public Tarefas criartTarefas(@RequestBody Tarefas tarefas) {
        return tarefasService.salvarTarefas(tarefas);
    }

    @PutMapping("/{id}")
    public Tarefas editarTarefas(@PathVariable Long id, @RequestBody Tarefas tarefas) {
        return tarefasService.editarTarefas(id, tarefas);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        tarefasService.deletarTarefas(id);
    }


    





}
