package com.sabertech.ananke.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

import com.sabertech.ananke.model.util.AreaConhecimento;
import com.sabertech.ananke.model.util.StatusProjeto;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_projeto")
public class Projeto {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(name = "matricula")
    // @OneToOne
    // private Usuario aluno;

    @OneToMany(mappedBy = "projeto")
    private List<Documento> documentos;

    @Enumerated(value = EnumType.STRING)
    @Column
    private StatusProjeto status = StatusProjeto.DISPONIVEL;

    @Column(columnDefinition = "VARCHAR(255)")
    private String tema;

    @Enumerated(value = EnumType.STRING)
    @Column
    private AreaConhecimento areaConhecimento = AreaConhecimento.OUTRAS;
}