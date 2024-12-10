package com.sabertech.ananke.exceptions;

public class ArquivoNaoEncontradoException extends RuntimeException {
    public ArquivoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
