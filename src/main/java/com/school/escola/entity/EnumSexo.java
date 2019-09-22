/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.escola.entity;

/**
 *
 * @author marcos
 */
public enum EnumSexo {
    M("Masculino"), F("Feminino");
    
    private String descricao;

    public String getDescricao() {
        return descricao;
    }
              
    EnumSexo(String descricao){
        this.descricao = descricao;
    }
}
