<%--
  Created by IntelliJ IDEA.
  User: will
  Date: 18/07/2022
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Pedido</title>
</head>
<body>

<c:choose>
    <c:when test="${info.equals('modopagamento')}">
    <br>
    <h2>Oi ${currenuser.name}, você selecionou o seguinte item: </h2>
    <h3>Prato: ${pratoselecionado.nome}</h3>
    <h3>R$ ${pratoselecionado.preco}</h3>
    <h3>Descrição: ${pratoselecionado.descricao}</h3>

<form action="/pedido" method="post">
    Forma de pagamento:

    <select name="pagamento">
        <c:forEach items="${formapagamento}" var="item">
            <option value="${item.id}">
                    ${item.descricao}
            </option>
        </c:forEach>
    </select>
    Observações:
    <input type="text" name="observacoes"/>
    <input type="submit" value="Comprar"/>
</form>

    </c:when>
</c:choose>
</body>
</html>
