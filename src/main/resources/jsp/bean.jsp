<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<jsp:useBean id="userBean" class="com.kov.lectures.lecture_9_Servlet.beans.User" scope="session">
  <jsp:setProperty name="userBean" property="firstName" value="Vasya"  />
</jsp:useBean>


param1: <jsp:getProperty name="userBean" property="firstName" />

</body>
</html>