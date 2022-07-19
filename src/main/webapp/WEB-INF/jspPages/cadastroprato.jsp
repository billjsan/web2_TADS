<%--
  Created by IntelliJ IDEA.
  User: will
  Date: 18/07/2022
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TADS Food</title>
</head>
<body>
<h1>Cadastrar Prato</h1>
<form method="post" action="/cadastroprato">
    Nome: <input type="text" name="nome" required/><br/>
    Preço: <input type="number" step="0.01" min="0.01" name="preco" required/><br/>
    Descrição: <input type="text" name="descricao"/><br/>
     <input type="url" name="imagem" required hidden/><br/>
    <input type="submit" value="cadastrar" />
</form>
</body>
</html>
