
package br.cairu.sexshop.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "entradaTB")
public class Entrada {
   
     
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="entrada_id")
    private Long entrada_id;    
    
    @Column(name ="produto_id")
    private Long produto_id;                
        
    @Column(name = "qtde")
    private int qtde;
    
    @Column (name = "valor_unitario")
    private Float valor_unitario;    
      
   
    public Long getEntrada_id() {
        return entrada_id;
    }

    public void setEntrada_id(Long entrada_id) {
        this.entrada_id = entrada_id;
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
