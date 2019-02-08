
package br.cairu.sexshop.bean;

import br.cairu.sexshop.dao.SaidaDao;
import br.cairu.sexshop.entity.Saida;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name = "saidaBean")
@RequestScoped
public class SaidaBean {
    
    private List<Saida> listaSaida;
    private Saida saida;
    private SaidaDao saidaDao = new SaidaDao();

    public SaidaBean() {
        saida = new Saida();
    }
    
    
     public void save(){
        
        SaidaDao dao = new SaidaDao();
        dao.saveSaida(saida);
            System.out.println("Blz");
    }
    
     public void update(){
        
        SaidaDao dao = new SaidaDao();
        dao.updateSaida(saida);
            System.out.println("Blz");
    }
    
     
    public void delete(){
        
        SaidaDao dao = new SaidaDao();
        dao.deleteSaida(saida);
        System.out.println("Blz");
    }

    public List<Saida> getListaSaida() {
        return listaSaida;
    }

    public void setListaSaida(List<Saida> listaSaida) {
        this.listaSaida = listaSaida;
    }

    public Saida getSaida() {
        return saida;
    }

    public void setSaida(Saida saida) {
        this.saida = saida;
    }

    private SaidaDao getSaidaDao() {
        return saidaDao;
    }

    private void setSaidaDao(SaidaDao saidaDao) {
        this.saidaDao = saidaDao;
    }
    
    
    
    
    
        public List listarSaida(){
        setListaSaida(getSaidaDao().getList());
        return this.getListaSaida();
    }
     
    
}
