
package br.cairu.sexshop.dao;

import br.cairu.sexshop.entity.Estoque;
import br.cairu.sexshop.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;




public class EstoqueDao {
    
    private Session sessao;
    private Transaction trans;
    private List<Estoque>list;
    
    
    public List<Estoque> getList() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        trans = sessao.beginTransaction();
        
        Criteria cri = sessao.createCriteria(Estoque.class);
        this.list = cri.list();

        return list;
    }
    
    
    
}
