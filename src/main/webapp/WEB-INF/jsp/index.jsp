<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<form method="post" action="/demo/login">
    用户名：<input name="username"/>
    密码： <input name="password"/>
    <input type="submit" value="确定">
    <a style="color: red">${errMsg}
</form>
</body>
</html>
