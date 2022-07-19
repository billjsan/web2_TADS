<%--
  Created by IntelliJ IDEA.
  User: will
  Date: 18/07/2022
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Tela Principal</title>
</head>
<body>
<h1>Tela Principal</h1>

<a href="${pageContext.request.contextPath}/">Sair</a>
<a href="${pageContext.request.contextPath}/verpedido?val=n">Meus Pedidos</a>
<br>
<c>${msg}</c>


<%-- ----------------------------------------  só para o adm  ----------------------------------- --%>
<c:choose>
    <c:when test="${isAdmin.equals('true')}">
        <br>
        <a href="${pageContext.request.contextPath}/cadastroprato">Cadastrar prato</a>
        <a href="${pageContext.request.contextPath}/visualizarusuarios">Visualizar Clientes</a>
        <a href="${pageContext.request.contextPath}/cadastropagamento">Cadastrar Forma de Pagamento</a>
        <a href="${pageContext.request.contextPath}/verpedido?val=todos">Ver todos os pedidos</a>
    </c:when>
</c:choose>
<%-- --------------------------------------  fim só para o adm  ----------------------------------- --%>
<%-- ---------------------------------- Mostra os pratos para todos ------------------------------- --%>

<h3>
    <c:forEach items="${pratos}" var="prato">
        Nome: ${prato.nome} Valor: R$${prato.preco} Des: ${prato.descricao}
        <a href="${pageContext.request.contextPath}/pedido?pratoid=${prato.id}"> Comprar </a> <br>
    </c:forEach>
</h3>

</body>
</html>