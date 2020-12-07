package com.example.serviceb.controllers;

import com.example.serviceb.models.Competicao;
import com.example.serviceb.service.CompeticaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/competicao")
@RequiredArgsConstructor
public class CompeticaoController {

    private final CompeticaoService competicaoService;

    @GetMapping
    public ResponseEntity<Competicao> get(){
        Competicao competicao = competicaoService.getCompeticao();
        return ResponseEntity.ok(competicao);
    }

}
