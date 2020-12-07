package com.example.servicea.service;

import com.example.servicea.models.Skatista;
import org.springframework.stereotype.Service;

@Service
public class SkatistaService {

    public Skatista getSkatista(){
        Skatista skatista = new Skatista();
        skatista.setId(1L);
        skatista.setNome("Milena");
        skatista.setCategoria("amador");
        return skatista;

    }
}
