
package br.cairu.sexshop.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "saidaTB")
public class Saida {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="saida_id")
    private Long saida_id; 
    
    @Column(name ="produto_id")
    private Long produto_id;
    
    @Column(name = "qtde")
    private int qtde;
    
    @Column (name = "valor_unitario")
    private Float valor_unitario;   
    
    public Long getSaida_id() {
        return saida_id;
    }

    public void setSaida_id(Long saida_id) {
        this.saida_id = saida_id;
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
