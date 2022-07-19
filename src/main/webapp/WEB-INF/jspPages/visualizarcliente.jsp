<%--
  Created by IntelliJ IDEA.
  User: will
  Date: 18/07/2022
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>TADS Food</title>
</head>
<body>

<h3>
  <c:forEach items="${users}" var="usuario">
    ${usuario.name} - ${usuario.email} <br>
  </c:forEach>
</h3>
</body>
</html>
