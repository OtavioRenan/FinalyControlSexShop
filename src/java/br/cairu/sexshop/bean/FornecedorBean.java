
package br.cairu.sexshop.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.cairu.sexshop.dao.FornecedorDao;
import java.util.List;
import br.cairu.sexshop.entity.Fornecedor;


@ManagedBean(name = "fornecedorBean")
@RequestScoped
public class FornecedorBean {
    
    private FornecedorDao fornecedorDao = new FornecedorDao(); 
    private List<Fornecedor> listaFornecedor;    
    private Fornecedor fornecedor;
    
    public FornecedorBean() {
        
        fornecedor = new Fornecedor();
        
    }
    
    
    public List listarFornecedor(){
       
        setListaFornecedor(getFornecedorDao().getList());
        return this.getListaFornecedor();
    }
    
    public void update(){
        FornecedorDao dao = new FornecedorDao();
        dao.updateFornecedor(fornecedor);
            System.out.println("Blz");
    }
    
    public void delete(){
        FornecedorDao dao = new FornecedorDao();
        dao.deleteFornecedor(fornecedor);
            System.out.println("Blz");
    }
    
    public void save(){
        
        FornecedorDao dao = new FornecedorDao();
        dao.saveFornecedor(fornecedor);
            System.out.println("Blz");
    }

    private FornecedorDao getFornecedorDao() {
        return fornecedorDao;
    }

    private void setFornecedorDao(FornecedorDao fornecedorDao) {
        this.fornecedorDao = fornecedorDao;
    }

    public List<Fornecedor> getListaFornecedor() {
        return listaFornecedor;
    }

    public void setListaFornecedor(List<Fornecedor> listaFornecedor) {
        this.listaFornecedor = listaFornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    
    
    
}
