<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>List Page</h1>
    <c:forEach var="dto" items="${list}">
        ${dto.mno} / ${dto.id} / ${dto.pw} / ${dto.name} <br/>
    </c:forEach>
</body>
</html>