<%--
  Created by IntelliJ IDEA.
  User: will
  Date: 17/07/2022
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/">
    Origem: <input type="text" name="origem"/><br/>
    Destino: <input type="text" name="destino"/><br/>
    Motivo: <input type="text" name="motivo"/><br/>

    Veículo: <select name="veiculo.placa">
    <c:forEach items="${carros}" var="item">
        <option value="${item.placa}">${item.placa}-${item.modelo}
        </option>
    </c:forEach>
    </select>
    <br/>
    Motorista: <select name="motorista.cpf">
    <c:forEach items="${motoristas}" var="item">
        <option value="${item.cpf}">${item.cpf}-${item.nome}
        </option>
    </c:forEach>
</select><br/>

    <input id="btnSubmit1" type="submit" value="cadastrar" />

</form>
</body>
</html>
