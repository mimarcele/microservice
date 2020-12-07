package com.example.serviceb.service;

import com.example.serviceb.models.Competicao;
import com.example.serviceb.models.Skatista;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompeticaoService {
    public Competicao getCompeticao(){
        Competicao competicao = new Competicao();
        competicao.setId(1L);
        competicao.setCompeticao("Competição de Skatistas amadoras");
        competicao.setLocal("Praça do Ó");
        competicao.setTipoSkate("street");

        RestTemplate restTemplate = new RestTemplate();

        Skatista skatista = restTemplate.getForEntity("http://localhost:8080/skatista", Skatista.class).getBody();

        competicao.setSkatista(skatista);

        return competicao;
    }
}
