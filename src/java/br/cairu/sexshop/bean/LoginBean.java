

package br.cairu.sexshop.bean;

import br.cairu.sexshop.dao.LoginDao;
import br.cairu.sexshop.entity.Login;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;



@ManagedBean
@RequestScoped
public class LoginBean {
    
    private Login login = new Login(); 
    private String senha;
    private String usuario;
    private LoginDao loginDao = new LoginDao();
    private List<Login> listaLogin;
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    public void enviarLogin(){
        
        loginDao.setNomeLoginDAO(usuario);
        loginDao.setSenhaLoginDAO(senha);
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(loginDao.autenticar());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
                      
    }

    private LoginDao getLoginDao() {
        return loginDao;
    }

    private void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    public List<Login> getListaLogin() {
        return listaLogin;
    }

    public void setListaLogin(List<Login> listaLogin) {
        this.listaLogin = listaLogin;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    
    
    public List listarLogin(){
        setListaLogin(getLoginDao().getList());
        return this.getListaLogin();
    }

    
    
    
}
