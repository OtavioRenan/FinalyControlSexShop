
package br.cairu.sexshop.dao;

import br.cairu.sexshop.entity.Entrada;
import br.cairu.sexshop.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;




public class EntradaDao {
    private Session sessao;
    private Transaction trans;
    private List<Entrada>list;
    
    public void saveEntrada(Entrada entrada){
        
        Session sessao = HibernateUtil.getSession();
    Transaction forn = sessao.beginTransaction();
    
    try {
        sessao.saveOrUpdate(entrada);
        forn.commit();
        sessao.close();
            System.out.println("Entrada Cadastrada com sucesso");
                
    }catch (Exception e) {
        forn.rollback();
            System.out.println("Erro ao cadastrar a  entrada" + e);
    }
        
        
    }
        

    
    
    
public void updateEntrada (Entrada entrada){
        
    Session sessao = HibernateUtil.getSession();
    Transaction forn = sessao.beginTransaction();
    
    try {
        sessao.update(entrada);
        forn.commit();
        sessao.close();
            System.out.println("Cadastrado com sucesso");
                
    }catch (Exception e) {
        forn.rollback();
            System.out.println("Erro ao cadastrar");
    }
    
    }
    
    
    public void deleteEntrada (Entrada entrada){
        
    Session sessao = HibernateUtil.getSession();
    Transaction forn = sessao.beginTransaction();
    
    try {
        sessao.delete(entrada);
        forn.commit();
        sessao.close();
            System.out.println("entrada deletada com sucesso");
                
    }catch (Exception e) {
        forn.rollback();
            System.out.println("Erro ao deletar entrada");
    }
    }
    
    
     public List<Entrada> getList() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        trans = sessao.beginTransaction();
        
        Criteria cri = sessao.createCriteria(Entrada.class);
        this.list = cri.list();

        return list;
    }
    
    
    
}
