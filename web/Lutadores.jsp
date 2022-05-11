<%-- 
    Document   : Lutadores
    Created on : 11/05/2022, 10:06:12
    Author     : Willian Santos
--%>

<%@page import="com.devcaotics.controllers.servlets.LutadorServlet"%>
<%@page import="com.devcaotics.model.negocios.Lutador"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lutadores Cadastrados</h1>
        <div>
        <a href="CadastroLutador.jsp">Adicionar Lutador</a>      
        </div>
        <%
            String mensagem = request.getParameter("msg");
            
            if(mensagem != null){
        %>
        <h3><%= mensagem %></h3>
        
        <%
            }    
        %>
        
        <%
            List<Lutador> lutadores = (List)request.getAttribute("lutadores");
        %>
        
        <table border="1">
            <tr>
                <th>id</th><th>Nome</th><th>Apelido</th><th>Altura</th>
                <th>Arte Marcial</th><th>Contato de Emergência</th>
                <th>Curso</th><th>IMC</th><th>Nascimento</th><th>Peso</th><th>Destro?</th>
            </tr>
            
            <% 
                for(Lutador lAux: lutadores){
            %>
                <tr>
                    <td><%= lAux.getId() %></td>
                    <td><%= lAux.getNome() %></td>
                    <td><%= lAux.getApelido() %></td>
                    <td><%= lAux.getAltura() %></td>
                    <td><%= lAux.getArtMarcial() %></td>
                    <td><%= lAux.getContatoEmergencia() %></td>
                    <td><%= lAux.getCurso() %></td>
                    <td><%= lAux.getImc() %></td>
                    <%
                    String nascimento = LutadorServlet.DateToString(lAux.getNascimento());
                    %>
                    <td><%= nascimento %></td>
                    <td><%= lAux.getPeso() %></td>
                    <%
                    String destro;
                    if(lAux.isDestro()){
                    destro = "sim";
                    }else{
                    destro = "não";
                    }
                    %>
                    <td><%= destro %></td>
                    
                    <td><a href="LutadorServlet?id=<%= lAux.getId() %>&op=update">alterar </a>
                        <a href="LutadorServlet?id=<%= lAux.getId() %>&op=delete">deletar</a></td>
                </tr>
            <% 
                }
            %>
        </table>
        
    </body>
</html>