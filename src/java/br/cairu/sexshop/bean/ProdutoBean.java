
package br.cairu.sexshop.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.cairu.sexshop.dao.ProdutoDao;
import br.cairu.sexshop.entity.Produto;
import java.util.List;



@ManagedBean(name = "produtoBean")
@RequestScoped
public class ProdutoBean {
    
    private List<Produto> listaProduto;
    private Produto produto;
    private ProdutoDao produtoDao = new ProdutoDao();
    
    
    public ProdutoBean(){
        
        produto = new Produto ();
        
    }
    
    
    public void save(){
        
        ProdutoDao dao = new ProdutoDao();
        dao.saveProduto(produto);
            System.out.println("Blz");
    }
    
     public void update(){
        
        ProdutoDao dao = new ProdutoDao();
        dao.updateProduto(produto);
            System.out.println("Blz");
    }
    
     
    public void delete(){
        
        ProdutoDao dao = new ProdutoDao();
        dao.deleteProduto(produto);
        System.out.println("Blz");
    }

    public List<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    private ProdutoDao getProdutoDao() {
        return produtoDao;
    }

    private void setProdutoDao(ProdutoDao produtoDao) {
        this.produtoDao = produtoDao;
    }
     
     public List listarProduto(){
        setListaProduto(getProdutoDao().getList());
        return this.getListaProduto();
    }
     
     
     
   
}
