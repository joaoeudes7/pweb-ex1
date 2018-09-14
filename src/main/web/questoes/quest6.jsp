<%--
  Created by IntelliJ IDEA.
  User: joaoeudes7
  Date: 13/09/18
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="post"  action="${pageContext.request.contextPath}/login">
    Nome de usuário: <input type="text" name="username"/><br>
    Senha: <input type="password" name="password"/><br>
    <button type="submit">Login</button>
    <a href="/index.html"><button>Voltar</button></a>

</form>
</body>
</html>
