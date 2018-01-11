<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stanislav
  Date: 03.01.18
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Book apartment</h2>
<form method="post" action="/create_order">
    <select name="numberOfRooms">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5+">5+</option>
    </select>

    <select name="apartmentType">
        <option value="standart">Standard</option>
        <option value="business">Business</option>
        <option value="deluxe">Deluxe</option>
        <option value="president">President</option>
    </select>

    <input name="dateFrom" type="date"/>
    <input name="dateTo" type="date"/>

    <input name="submit" type="submit" value="Confirm">
</form>

<form action="/sign_out" method="post">
    <button type="submit">Exit</button>
</form>

<div>
    <h2>History</h2>
    <hr>
    <c:forEach items="${sessionScope.orders}" var="item">
        <c:out value="${item.numberOfRooms}"/>
        <c:out value="${item.apartmentType}"/>
        <br>
    </c:forEach>
</div>

</body>
</html>