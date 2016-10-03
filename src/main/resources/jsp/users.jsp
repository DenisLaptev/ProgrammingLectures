<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
  <title>Home Page</title>
  <style>
    table,th,td
    {
      border:1px solid black;
    }
  </style>
</head>
<body>
<%-- Using JSTL forEach and out to loop a list and display items in table --%>
<table>
  <tbody>
  <tr><th>ID</th><th>Name</th><th>Role</th></tr>
  ${sessionScope.users[0]}
<%--  <c:forEach items="${sessionScope.users}" var="test">
    &lt;%&ndash;<tr><td><c:out value="${user.id}"></c:out></td>&ndash;%&gt;
      <td><c:out value="${test.age}"></c:out></td>
      <td><c:out value="${test.firstName}"></c:out></td>
  </c:forEach>--%>
  </tbody>
</table>

</body>
</html>