<%--
  Created by IntelliJ IDEA.
  User: will
  Date: 18/07/2022
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TADS Food</title>
</head>
<body>
<h1>Cadastrar forma de pagamento</h1>
<form method="post" action="/cadastropagamento">
    Descrição: <input type="text" name="descricao" required/><br/>
    <input type="submit" value="cadastrar" />
</form>
</body>
</html>
