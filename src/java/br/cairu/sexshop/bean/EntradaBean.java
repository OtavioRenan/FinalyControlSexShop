
package br.cairu.sexshop.bean;

import br.cairu.sexshop.dao.EntradaDao;
import br.cairu.sexshop.entity.Entrada;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean(name = "entradaBean")
@RequestScoped
public class EntradaBean {
    
    private List<Entrada> listaEntrada;
    private Entrada entrada;
    private EntradaDao entradaDao = new EntradaDao();
    
    public EntradaBean(){
        
        entrada = new Entrada ();
        
    }
    
    
    public void save(){
        
        EntradaDao dao = new EntradaDao();
        dao.saveEntrada(entrada);
            System.out.println("Blz");
    }
    
     public void update(){
        
        EntradaDao dao = new EntradaDao();
        dao.updateEntrada(entrada);
            System.out.println("Blz");
    }
    
     
    public void delete(){
        
       EntradaDao dao = new EntradaDao();
        dao.deleteEntrada(entrada);
        System.out.println("Blz");
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    private EntradaDao getEntradaDao() {
        return entradaDao;
    }

   private void setEntradaDao(EntradaDao entradaDao) {
        this.entradaDao = entradaDao;
    }

    
    
    public List<Entrada> getListaEntrada() {
        return listaEntrada;
    }

    public void setListaEntrada(List<Entrada> listaEntrada) {
        this.listaEntrada = listaEntrada;
    }
    
  
    
     public List listarEntrada(){
        setListaEntrada(getEntradaDao().getList());
        return this.getListaEntrada();
    }
    
}
