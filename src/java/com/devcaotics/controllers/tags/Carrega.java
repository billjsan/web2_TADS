/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers.tags;

import com.devcaotics.model.repositorios.RepositorioLocalMemo;
import java.io.IOException;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author will
 */
public class Carrega extends SimpleTagSupport{
    
    private String classe;
    private String var;
    
    public Carrega() {
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag(); 
        
        List<?> lista;       
        if(classe.equals("locais")){
            lista = RepositorioLocalMemo.getCurrentInstance().lerTudo();
        }
        else if(classe.equals("lutadores")){
            lista = RepositorioLocalMemo.getCurrentInstance().lerTudoLutador();
        }else{
            lista = null;
        }
        getJspContext().setAttribute(var, lista,PageContext.PAGE_SCOPE );
    }
    
    
}
