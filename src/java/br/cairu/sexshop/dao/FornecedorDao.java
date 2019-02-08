
package br.cairu.sexshop.dao;

import br.cairu.sexshop.entity.Fornecedor;
import br.cairu.sexshop.util.HibernateUtil;
import java.util.List;
import javax.faces.bean.RequestScoped;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;



@RequestScoped
public class FornecedorDao {
    
    private Session sessao;
    private Transaction trans;
    private List<Fornecedor>list;
    
    
    public List<Fornecedor> getList() {
        sessao =HibernateUtil.getSessionFactory().openSession();
        trans = sessao.beginTransaction();
        
        Criteria cri = sessao.createCriteria(Fornecedor.class);
        this.list = cri.list();

        return list;
    }
 
    
    public void saveFornecedor (Fornecedor fornecedor){
    
    Session sessao = HibernateUtil.getSession();
    Transaction forn = sessao.beginTransaction();
    
    try {
        sessao.saveOrUpdate(fornecedor);
        forn.commit();
        sessao.close();
            System.out.println("Cadastrado com sucesso");
                
    }catch (Exception e) {
        forn.rollback();
            System.out.println("Erro ao cadastrar");
    }
    
    
    }
    
    
    public void deleteFornecedor(Fornecedor fornecedor){
        
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
        
            sessao.delete(fornecedor);
            trans.commit();
        } catch (Exception e) {
            sessao.close();
        }
        
    }
    
    
    public void updateFornecedor (Fornecedor fornecedor){
    
        Session sessao = HibernateUtil.getSession();
        Transaction forn = sessao.beginTransaction();
    
        try {
            sessao.update(fornecedor);
            forn.commit();
            sessao.close();
            System.out.println("Cadastrado com sucesso");
                
        }catch (Exception e) {
            forn.rollback();
            System.out.println("Erro ao cadastrar");
        }

    }
    
    
}
