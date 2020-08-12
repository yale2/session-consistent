<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<header>
    <script type="text/javascript" src="${pageContext.request.contextPath }/jquery.min.js"></script>
    <script type="application/javascript">
        $(function () {
            $("#ajaxBtn").bind("click", function () {
                // 发送ajax请求
                $.ajax({
                    url: '${pageContext.request.contextPath }/demo/add',
                    type: 'GET',
                    contentType: 'application/json;charset=utf-8'
                })

            })
        })
    </script>

</header>
<body>
<a href="${pageContext.request.contextPath }/demo/add"> 新增</a>


<table width="100%" border=1>
    <tr>
        <td hidden="hidden">ID</td>
        <td>用户名</td>
        <td>联系方式</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${resumes}" var="resume">
        <tr>
            <td>${resume.username }</td>
            <td>${resume.mobile }</td>
            <td><a href="${pageContext.request.contextPath }/demo/edit?id=${resume.id}">修改</a>
                <a href="${pageContext.request.contextPath }/demo/delete?id=${resume.id}">删除</a>
            </td>

        </tr>
    </c:forEach>
</table>
</body>
</html>

