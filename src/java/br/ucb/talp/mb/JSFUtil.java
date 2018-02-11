/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.talp.mb;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author P04009628
 */
public class JSFUtil {

    public static void addMessage(String msg) {
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(msg));
    }
    
}
