package com.sabertech.ananke.model.orientacao;

import com.sabertech.ananke.model.Documento;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrientacaoPresencial extends Orientacao {

    private String observacoes;

    private List<Documento> anexos;
}
