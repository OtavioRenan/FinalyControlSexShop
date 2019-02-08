
package br.cairu.sexshop.bean;

import br.cairu.sexshop.dao.EstoqueDao;
import br.cairu.sexshop.entity.Estoque;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean(name = "estoqueBean")
@RequestScoped
public class EstoqueBean {
    
    private List<Estoque> listaEstoque;
    private Estoque estoque;
    private EstoqueDao estoqueDao = new EstoqueDao();
    
       public EstoqueBean(){
        
        estoque = new Estoque ();
        
    }

    public List<Estoque> getListaEstoque() {
        return listaEstoque;
    }

    public void setListaEstoque(List<Estoque> listaEstoque) {
        this.listaEstoque = listaEstoque;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    private EstoqueDao getEstoqueDao() {
        return estoqueDao;
    }

    private void setEstoqueDao(EstoqueDao estoqueDao) {
        this.estoqueDao = estoqueDao;
    }
    
    
       
    
      public List listarEstoque(){
        setListaEstoque(getEstoqueDao().getList());
        return this.getListaEstoque();
    }
    
}
