<%-- 
    Document   : Lutadores
    Created on : 11/05/2022, 10:06:12
    Author     : Willian Santos
--%>

<%@page import="com.devcaotics.controllers.servlets.LutadorServlet"%>
<%@page import="com.devcaotics.model.negocios.Lutador"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ifpe" uri="recife.ifpe.edu.br.willian.tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lutadores Cadastrados</h1>
        
        <ifpe:carrega classe="lutadores" var="lut"/>
        <h3>teste carrega size: ${lut.size()}</h3>
         
        <ifpe:carregaum classe="lutadores" var="lutador" indice="100"/>    
        <h3>teste carregaUm: ${lutador.toString()}</h3>
    
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
        <ifpe:tabela classe="${lutadores}"/>
    </body>
</html>