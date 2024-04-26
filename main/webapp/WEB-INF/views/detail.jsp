<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Detail Page</h1>
    <hr/>
    ${dto.mno} / ${dto.id} / ${dto.pw} / ${dto.name}
    <a href="delete?id=${dto.id}">삭제</a>
</body>
</html>