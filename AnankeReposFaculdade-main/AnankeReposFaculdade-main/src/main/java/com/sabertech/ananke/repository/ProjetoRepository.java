package com.sabertech.ananke.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sabertech.ananke.model.Projeto;


@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{
    
}
