<%--
  Created by IntelliJ IDEA.
  User: will
  Date: 18/07/2022
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<a href="${pageContext.request.contextPath}/">Início</a>
<a href="${pageContext.request.contextPath}/cadastro">Cadastrar</a>
<h3> <c> ${msg}</c> </h3>
<form method="post" action="/login">
    e-mail: <input type="email" name="email" required/><br/>
    Senha: <input type="password" name="senha" required/><br/>
    <input type="submit" value="Login" />
</form>
</body>
</html>
