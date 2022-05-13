<%-- 
    Document   : CadastroLutador
    Created on : 11/05/2022, 10:05:29
    Author     : Willian Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
       <h1>Cadastro de Lutador</h1>

       <form class="form" method="post"  action="LutadorServlet">
            
            <table class="table">
                <tr>
                    <td>
                        Nome: 
                    </td>
                    <td>
                        <input type="text" name="nome"  /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Apelido: 
                    </td>
                    <td>
                        <input type="text" name="apelido" /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Peso: 
                    </td>
                    <td>
                        <input type="number" step="0.01" name="peso"  /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Altura: 
                    </td>
                    <td>
                        <input type="number" step="0.01" name="altura"  /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Nascimento: 
                    </td>
                    <td>
                        <input type="date" name="nascimento"  /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Destro:
                    </td>
                    <td>
                        <label>sim</label>
                        <input type="checkbox" id="sim" name="destro" value="true" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Curso:
                    </td>
                    <td>
                        <input type="text" name="curso"  /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Arte Marcial: 
                    </td>
                    <td>
                        <input type="text" name="artemarcial"  /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Contato de Emergência: 
                    </td>
                    <td>
                        <input type="text" name="contatoemergencia"  /> 
                    </td>
                </tr>
                <tr>
                    <td rowspan="2"> 
                        <input type="submit" class="btn btn-primary" value="cadastrar"/>
                    </td>
                </tr>
            </table> 
        </form>
    
</html>
