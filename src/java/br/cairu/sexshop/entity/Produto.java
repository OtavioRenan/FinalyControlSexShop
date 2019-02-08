
package br.cairu.sexshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtoTB")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="produto_id")
    private Long produto_id;    
    
    @Column(name ="produto_nome", length = 80, unique = true)
    private String produto_nome;
    
    @Column(name = "fornecedor_id")//chave estrangeira do fornecedor
    private Long fornecedor_id; 
        
    @Column(name = "produto_descricao", length = 200)
    private String produto_descricao;

    public Long getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Long produto_id) {
        this.produto_id = produto_id;
    }

    public String getProduto_nome() {
        return produto_nome;
    }

    public void setProduto_nome(String produto_nome) {
        this.produto_nome = produto_nome;
    }

    public Long getFornecedor_id() {
        return fornecedor_id;
    }

    public void setFornecedor_id(Long fornecedor_id) {
        this.fornecedor_id = fornecedor_id;
    }

    public String getProduto_descricao() {
        return produto_descricao;
    }

    public void setProduto_descricao(String produto_descricao) {
        this.produto_descricao = produto_descricao;
    }
    
    
}
