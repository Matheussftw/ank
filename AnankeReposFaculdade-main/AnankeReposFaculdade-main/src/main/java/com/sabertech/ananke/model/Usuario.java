package com.sabertech.ananke.model;

import com.sabertech.ananke.model.util.Perfil;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_usuario")
public class Usuario {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "perfil")
    private Perfil perfil = Perfil.ALUNO;

    @Column(name = "matricula",columnDefinition = "VARCHAR(255)")
    private String matricula;

    @Column(columnDefinition = "VARCHAR(255)")
    private String tokenAcesso;
}
