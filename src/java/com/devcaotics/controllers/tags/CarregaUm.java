/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers.tags;

import com.devcaotics.model.negocios.Local;
import com.devcaotics.model.negocios.Lutador;
import com.devcaotics.model.negocios.NoOne;
import com.devcaotics.model.repositorios.RepositorioLocalMemo;
import java.io.IOException;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Willian Santos
 */
public class CarregaUm extends SimpleTagSupport{
    
    private String classe;
    private String var;
    private int indice;

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

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag(); 

        switch (classe) {
            case "locais":
                
                List<Local> listaLocais = (List<Local>) RepositorioLocalMemo.getCurrentInstance().lerTudo();
                
                if(listaLocais != null && !listaLocais.isEmpty()){
                    if(indice >= 0 && indice <= listaLocais.size()){
                        getJspContext().setAttribute(var, listaLocais.get(indice),PageContext.PAGE_SCOPE );   
                    }
                }
                getJspContext().setAttribute(var, new NoOne("Object not found in the list"),PageContext.PAGE_SCOPE ); 
                break;
            case "lutadores":
                
                List<Lutador> listaLutadores = (List<Lutador>) RepositorioLocalMemo.getCurrentInstance().lerTudoLutador();
                if(listaLutadores != null && !listaLutadores.isEmpty()){
                    if(indice >= 0 && indice <= listaLutadores.size()){
                    getJspContext().setAttribute(var, listaLutadores.get(indice),PageContext.PAGE_SCOPE );   
                    }
                }
                getJspContext().setAttribute(var, new NoOne("Object not found in the list"),PageContext.PAGE_SCOPE );
                break;
            default:
                
                getJspContext().setAttribute(var, new NoOne("List not found"),PageContext.PAGE_SCOPE );
                break;
        }
    } 
}
