
package br.cairu.sexshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "fornecedorTB")
public class Fornecedor {
    
    @Id
    @Column(name = "fornecedor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fornecedor_id;
 
    
    @Column (name = "nome_completo", unique = true)
    private String nome_completo;
    
    @Column (name ="telefone_celular")
    private String telefone_celular;
    
    @Column (name = "email")
    private String email;
    
    @Column (name = "fornecedor_descricao")
    private String fornecedor_descricao; 

    public Long getFornecedor_id() {
        return fornecedor_id;
    }

    public void setFornecedor_id(Long fornecedor_id) {
        this.fornecedor_id = fornecedor_id;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getTelefone_celular() {
        return telefone_celular;
    }

    public void setTelefone_celular(String telefone_celular) {
        this.telefone_celular = telefone_celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFornecedor_descricao() {
        return fornecedor_descricao;
    }

    public void setFornecedor_descricao(String fornecedor_descricao) {
        this.fornecedor_descricao = fornecedor_descricao;
    }
    
    
}
