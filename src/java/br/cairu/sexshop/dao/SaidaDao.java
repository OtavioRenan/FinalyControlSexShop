
package br.cairu.sexshop.dao;

import br.cairu.sexshop.entity.Saida;
import br.cairu.sexshop.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class SaidaDao {
    
    private Session sessao;
    private Transaction trans;
    private List<Saida>list;
    
    
    
     public void saveSaida (Saida saida){
        
    Session sessao = HibernateUtil.getSession();
    Transaction forn = sessao.beginTransaction();
    
    try {
        sessao.saveOrUpdate(saida);
        forn.commit();
        sessao.close();
            System.out.println("Saída Cadastrada com sucesso");
                
    }catch (Exception e) {
        forn.rollback();
            System.out.println("Erro ao cadastrar saída");
    }
        
        
    }
    
    
    public void updateSaida (Saida saida){
        
    Session sessao = HibernateUtil.getSession();
    Transaction forn = sessao.beginTransaction();
    
    try {
        sessao.update(saida);
        forn.commit();
        sessao.close();
            System.out.println("Update Cadastrado com sucesso");
                
    }catch (Exception e) {
        forn.rollback();
            System.out.println("Erro ao update");
    }
    
    }
    
    
    public void deleteSaida (Saida saida){
        
    Session sessao = HibernateUtil.getSession();
    Transaction forn = sessao.beginTransaction();
    
    try {
        sessao.delete(saida);
        forn.commit();
        sessao.close();
            System.out.println("delete com sucesso");
                
    }catch (Exception e) {
        forn.rollback();
            System.out.println("Erro ao deletar");
    }
    }
    
    
     public List<Saida> getList() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        trans = sessao.beginTransaction();
        
        Criteria cri = sessao.createCriteria(Saida.class);
        this.list = cri.list();

        return list;
    }
    
    
    
    
    
}
