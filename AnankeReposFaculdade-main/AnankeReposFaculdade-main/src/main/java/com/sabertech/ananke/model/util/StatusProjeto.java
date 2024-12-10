package com.sabertech.ananke.model.util;

public enum StatusProjeto {
    DISPONIVEL(1),
    ANDAMENTO(2),
    CANCELADO(3),
    CONFIRMADO(4);

    private int status;

    StatusProjeto(int status){
        this.status = status;
    }

    public int getStatus(){
        return this.status;
    }
}
