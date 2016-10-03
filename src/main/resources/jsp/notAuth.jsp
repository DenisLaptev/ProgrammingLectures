<%--
  Created by IntelliJ IDEA.
  User: Kovantonlenko
  Date: 12/21/2015
  Time: 12:15 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <title></title>
</head>
<body>
You set incorrect AUTH data, try again.
<a href="<c:url value="/"/>">AUTH</a> or register if you not <a href="<c:url value="/registration"/>">registration</a>

</body>
</html>
