<%-- 
    Document   : AtualizaLutador
    Created on : 11/05/2022, 10:05:52
    Author     : Willian Santos
--%>

<%@page import="com.devcaotics.controllers.servlets.LutadorServlet"%>
<%@page import="com.devcaotics.model.negocios.Lutador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h1>Atualizar um Lutador</h1>
        
        <% 
            Lutador lutador = (Lutador)request.getAttribute("lutador");
        %>
        
        <form class="form" method="post"  action="LutadorServlet">
            
            <input type="hidden" name="id" value="<%= lutador.getId() %>"/>
            <input type="hidden" name="op" value="update"/>
            
            <table class="table">
                <tr>
                    <td>
                        Nome: 
                    </td>
                    <td>
                        <input type="text" name="nome" value="<%= lutador.getNome() %>"  /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Apelido: 
                    </td>
                    <td>
                        <input type="text" name="apelido" value="<%= lutador.getApelido() %>" /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Peso: 
                    </td>
                    <td>
                        <input type="number" step="0.01" name="peso" value="<%= lutador.getPeso() %>"  /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Altura: 
                    </td>
                    <td>
                        <input type="number" step="0.01" name="altura" value="<%= lutador.getAltura() %>" /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Nascimento: 
                    </td>
                    
                    <%
                    String nascimento = LutadorServlet.DateToString(lutador.getNascimento());
                    %>
                    <td>
                        
                        <input type="date" name="nascimento" value="<%=nascimento%>" /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Destro:
                    </td>
                    <td>
                        <label>sim</label>
                        <% 
                        String txt;
                        if(lutador.isDestro()){
                        txt = "checked";
                        }else{
                        txt = " ";
                        }
                        %>
                        <input type="checkbox" name="destro" value="<%= lutador.isDestro() %>" <%= txt %> />
                    </td>
                </tr>
                <tr>
                    <td>
                        Curso:
                    </td>
                    <td>
                        <input type="text" name="curso" value="<%= lutador.getCurso() %>" /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Arte Marcial: 
                    </td>
                    <td>
                        <input type="text" name="artemarcial" value="<%= lutador.getArtMarcial() %>" /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Contato de Emergência: 
                    </td>
                    <td>
                        <input type="text" name="contatoemergencia" value="<%= lutador.getContatoEmergencia() %>" /> 
                    </td>
                </tr>
                <tr>
                    <td rowspan="2"> 
                        <input type="submit" class="btn btn-primary" value="atualizar"/>
                    </td>
                </tr>
            </table> 
        </form>
        
    </body>
</html>
