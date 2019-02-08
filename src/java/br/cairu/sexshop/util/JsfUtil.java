/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cairu.sexshop.util;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author USER
 */
@ManagedBean(name = "mensagem")
public class JsfUtil {
    
    
    public static void adicionarMensagemSucesso(String mensagem) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", mensagem);
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.addMessage(null, msg);

    }
    public static void adicionarMensagemErro(String mensagem) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "", mensagem);
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.addMessage(null, msg);

    }
    
      public void msg() {

        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage("Não pode ser Remolvido.", new FacesMessage( "","Atualizado com Sucesso!"));
    }
    
}