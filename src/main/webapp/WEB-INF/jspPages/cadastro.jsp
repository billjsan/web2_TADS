<%--
  Created by IntelliJ IDEA.
  User: will
  Date: 17/07/2022
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cadastro</title>
</head>
<body>
<h1>Tela de Cadastro</h1>
<a href="${pageContext.request.contextPath}/">Início</a>
<a href="${pageContext.request.contextPath}/login">Login</a>
<h2>${msg}</h2>
<form method="post" action="/cadastro">
        Nome: <input type="text" name="name" required/><br/>
        CPF: <input type="text" name="cpf" required/><br/>
        e-mail: <input type="email" name="email" required/><br/>
        Senha: <input type="password" name="senha" required/><br/>
        Telefone: <input type="tel" name="telefone" required/><br/>
    <input type="submit" value="cadastrar" />
</form>

</body>

</html>