<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<form action="${pageContext.request.contextPath}/demo/save" method="post">
    <table border="1">
        <tr>
            <td>用户名称</td>
            <td><input type="text" name="username" value="${resume.username }"/></td>
        </tr>
        <tr>
            <td>联系方式</td>
            <td><input type="text" name="mobile" value="${resume.mobile}"/></td>
        </tr>
    </table>
    <input type="submit" value="保存"/>
</form>
<body>