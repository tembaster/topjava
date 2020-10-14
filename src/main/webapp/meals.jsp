<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="ru">
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Meals</h2>
<table>
    <c:forEach items="${meals}" var="meals">
        <tr>
            <td>${meals.dateTime}</td>
            <td>${meals.description}</td>
            <td>${meals.calories}</td>
            <td>${mealsr.excess}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>