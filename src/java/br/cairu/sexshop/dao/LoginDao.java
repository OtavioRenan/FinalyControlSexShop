
package br.cairu.sexshop.dao;


import br.cairu.sexshop.conexao.FabricaDeConexao;
import br.cairu.sexshop.entity.Login;
import br.cairu.sexshop.util.HibernateUtil;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;




public class LoginDao {
    
    private Session sessao;
    private Transaction trans;    
    private String nomeLoginDAO;
    private String senhaLoginDAO;
    private List<Login>list;
    
     public String autenticar() {

        try {

            FabricaDeConexao fab = new FabricaDeConexao();
            fab.abrirConexao();
            fab.stmt = fab.conn.createStatement();
            String sql = "select * from LOGINTB";
            fab.rs = fab.stmt.executeQuery(sql);

            while (fab.rs.next()) {

                if (nomeLoginDAO.equals(fab.rs.getString("usuario")) && (senhaLoginDAO.equals(fab.rs.getString("senha")))) {

                   br.cairu.sexshop.util.JsfUtil.adicionarMensagemSucesso("Acesso Permitido !");

                    return "Venda.xhtml";
                    

                }
            }
        } catch (SQLException e) {

        }
         br.cairu.sexshop.util.JsfUtil.adicionarMensagemErro("Erro login ou Senha!");

         return "index.xhtml";
    }

    public String getNomeLoginDAO() {
        return nomeLoginDAO;
    }

    public void setNomeLoginDAO(String nomeLoginDAO) {
        this.nomeLoginDAO = nomeLoginDAO;
    }

    public String getSenhaLoginDAO() {
        return senhaLoginDAO;
    }

    public void setSenhaLoginDAO(String senhaLoginDAO) {
        this.senhaLoginDAO = senhaLoginDAO;
    }
    
    
    
    //Metodo de teste
    
     public List<Login> getList() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        trans = sessao.beginTransaction();
        
        Criteria cri = sessao.createCriteria(Login.class);
        this.list = cri.list();

        return list;
    }
    
    
     
    
    
}
