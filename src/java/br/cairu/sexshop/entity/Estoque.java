/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cairu.sexshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "estoqueTB")
public class Estoque {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="estoque_id")
    private Long estoque_id; 
    
    @Column(name ="produto_id")
    private Long produto_id;
    
    @Column(name = "qtde")
    private int qtde;
    
    @Column (name = "valor_unitario")
    private Float valor_unitario;

    public Long getEstoque_id() {
        return estoque_id;
    }

    public void setEstoque_id(Long estoque_id) {
        this.estoque_id = estoque_id;
    }

    public Long getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Long produto_id) {
        this.produto_id = produto_id;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public Float getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
    
    
}
