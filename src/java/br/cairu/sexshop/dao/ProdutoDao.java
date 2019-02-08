/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cairu.sexshop.dao;

import br.cairu.sexshop.entity.Produto;
import br.cairu.sexshop.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class ProdutoDao {
    private Session sessao;
    private Transaction trans;
    private List<Produto>list;
    
    
    public void saveProduto (Produto produto){
        
    Session sessao = HibernateUtil.getSession();
    Transaction forn = sessao.beginTransaction();
    
    try {
        sessao.saveOrUpdate(produto);
        forn.commit();
        sessao.close();
            System.out.println("Cadastrado com sucesso");
                
    }catch (Exception e) {
        forn.rollback();
            System.out.println("Erro ao cadastrar");
    }
        
        
    }
    
    
    public void updateProduto (Produto produto){
        
    Session sessao = HibernateUtil.getSession();
    Transaction forn = sessao.beginTransaction();
    
    try {
        sessao.update(produto);
        forn.commit();
        sessao.close();
            System.out.println("Cadastrado com sucesso");
                
    }catch (Exception e) {
        forn.rollback();
            System.out.println("Erro ao cadastrar");
    }
    
    }
    
    
    public void deleteProduto (Produto produto){
        
    Session sessao = HibernateUtil.getSession();
    Transaction forn = sessao.beginTransaction();
    
    try {
        sessao.delete(produto);
        forn.commit();
        sessao.close();
            System.out.println("delete com sucesso");
                
    }catch (Exception e) {
        forn.rollback();
            System.out.println("Erro ao deletar");
    }
    }
    
    
     public List<Produto> getList() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        trans = sessao.beginTransaction();
        
        Criteria cri = sessao.createCriteria(Produto.class);
        this.list = cri.list();

        return list;
    }
    
    
    
    
}
