package com.example.servicea.controller;

import com.example.servicea.models.Skatista;
import com.example.servicea.service.SkatistaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skatista")
@RequiredArgsConstructor
public class SkatistaController {

    private final SkatistaService skatistaService;

    @GetMapping
    public ResponseEntity<Skatista> get(){
        Skatista skatista = skatistaService.getSkatista();
        return ResponseEntity.ok(skatista);
    }
}
