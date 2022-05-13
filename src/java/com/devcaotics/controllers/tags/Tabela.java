/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers.tags;

import com.devcaotics.controllers.servlets.LutadorServlet;
import com.devcaotics.model.negocios.Local;
import com.devcaotics.model.negocios.Lutador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author willian santos
 */
public class Tabela extends SimpleTagSupport{

private List<?> classe = new ArrayList<>();

    public void setClasse(List<?> classe) {
        this.classe = classe;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag(); 
        
//        StringWriter body = new StringWriter();
//        getJspBody().invoke(body);

        String content = "";
        if(classe != null && !classe.isEmpty()){
        
            //imprime a lista de lutadores
            if(classe.get(0) instanceof Lutador){
        
                List<Lutador> lutadores = (List<Lutador>) classe;
                
                content += "<table border=\"1\">\n" +
"               <tr>\n" +
"                   <th>id</th><th>Nome</th><th>Apelido</th><th>Altura</th>\n" +
"                   <th>Arte Marcial</th><th>Contato de Emergência</th>\n" +
"                   <th>Curso</th><th>IMC</th><th>Nascimento</th><th>Peso</th><th>Destro?</th>\n" +
"               </tr>";
            
                for(Lutador lAux: lutadores){
                    
                    content +="<tr>" +
                    "<td>"+lAux.getId()+"</td>"+
                    "<td>"+lAux.getNome()+"</td>"+
                    "<td>"+lAux.getApelido()+"</td>"+
                    "<td>"+lAux.getAltura()+"</td>"+
                    "<td>"+lAux.getArtMarcial()+"</td>"+
                    "<td>"+lAux.getContatoEmergencia()+"</td>"+
                    "<td>"+lAux.getCurso()+"</td>"+
                    "<td>"+lAux.getImc()+"</td>";
                    
                    String nascimento = LutadorServlet.DateToString(lAux.getNascimento());
                    content +=
                    "<td>"+nascimento+"</td>"+
                    "<td>"+lAux.getPeso()+"</td>";
                    String destro;
                    if(lAux.isDestro()){
                    destro = "sim";
                    }else{
                    destro = "não";
                    }
                   content +=
                    "<td>"+destro+"</td>"+
                    "<td><a href=\"LutadorServlet?id="+lAux.getId()+"&op=update\">alterar </a>"+
                    "<a href=\"LutadorServlet?id="+lAux.getId()+"&op=delete\">deletar</a></td>"+
                    "</tr>";
                }
                content +="</table>";
            }
            
            //imprime a lista de locais
            if(classe.get(0) instanceof Local){
            
            List<Local> locais = (List<Local>) classe;
            
            // TODO

            }
        }

        getJspContext().getOut().print(content);    
    } 
}