package com.sabertech.ananke.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sabertech.ananke.model.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
