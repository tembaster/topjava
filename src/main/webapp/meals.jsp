<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html lang="ru">
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Meals</h2>
<table border=1>
    <tr>
        <th>dateTime</th>
        <th>desc</th>
        <th>calories</th>
    </tr>
    <c:forEach items="${requestScope.meals}" var="meal">
        <tr style="color:${meal.excess ? 'green' : 'red'}">
            <td><fmt:parseDate value="${meal.dateTime}" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime"
                           type="both"/>
                <fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${parsedDateTime}"/></td>
            <td><c:out value="${meal.description}" /></td>
            <td><c:out value="${meal.calories}" /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
