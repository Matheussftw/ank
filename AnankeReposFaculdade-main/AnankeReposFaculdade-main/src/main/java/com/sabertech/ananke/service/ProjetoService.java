package com.sabertech.ananke.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabertech.ananke.model.Projeto;
import com.sabertech.ananke.repository.ProjetoRepository;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository ProjetoRepository;
    
    public Projeto salvarDoc(Projeto projeto) {
        return ProjetoRepository.save(projeto);
    }

    public List<Projeto> listaDeProjeto(){
        return ProjetoRepository.findAll();
    }


    
}
