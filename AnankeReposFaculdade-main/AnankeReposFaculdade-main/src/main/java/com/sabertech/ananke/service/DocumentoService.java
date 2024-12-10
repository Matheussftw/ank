package com.sabertech.ananke.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabertech.ananke.exceptions.ArquivoNaoEncontradoException;
import com.sabertech.ananke.model.Documento;
import com.sabertech.ananke.repository.DocumentoRepository;

@Service
public class DocumentoService {

    @Autowired
    DocumentoRepository documentoRepository;

    public List<Documento> listDeDocumentos() {
        return documentoRepository.findAll();
    }

    public Documento salvar(Documento documento) {
        documento.setDataCriacao(new Date());

        return documentoRepository.save(documento);

    }

    public Documento buscarPorId(Long id) {
        return documentoRepository.findById(id)
                .orElseThrow(() -> new ArquivoNaoEncontradoException(
                        String.format("Documento de codigo '%s' não Econtrado. Verifique os campos", id)));
    }
}
