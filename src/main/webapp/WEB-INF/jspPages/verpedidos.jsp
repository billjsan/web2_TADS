<%--
  Created by IntelliJ IDEA.
  User: will
  Date: 18/07/2022
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pedidos</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/login">Inicio</a> <a href="${pageContext.request.contextPath}/">Sair</a>
<c:choose>
    <c:when test="${info.equals('meuspedidos')}">

        <h2>Seus Pedidos</h2>
        <c:forEach items="${pedidos}" var="item">
            <c:choose>
                <c:when test="${item.user.cpf.equals(currentuser.cpf)}">
                    <h4> Pedido ${item.id} </h4>
                    <table>
                        <tr>
                            <th>item</th>
                            <td>${item.prato.nome}</td>
                        </tr>
                        <tr>
                        </tr>
                        <tr>
                            <th>preço</th>
                            <td>${item.prato.preco}</td>
                        </tr>
                        <tr>
                            <th>forma de pagamento</th>
                            <td>${item.pagamento.descricao}</td>
                        </tr>
                    </table>
                </c:when>
            </c:choose>
        </c:forEach>

    </c:when>


    <c:when test="${info.equals('todosospedidos')}">
        <h2>Todos os Pedidos</h2>
        <c:forEach items="${pedidos}" var="item">
                    <h4> Pedido ${item.id} </h4>
                    <table>
                        <tr>
                            <th>item</th>
                            <td>${item.prato.nome}</td>
                        </tr>
                        <tr>
                        </tr>
                        <tr>
                            <th>preço</th>
                            <td>${item.prato.preco}</td>
                        </tr>
                        <tr>
                            <th>forma de pagamento</th>
                            <td>${item.pagamento.descricao}</td>
                        </tr>
                    </table>
        </c:forEach>

    </c:when>
</c:choose>
</body>
</html>
