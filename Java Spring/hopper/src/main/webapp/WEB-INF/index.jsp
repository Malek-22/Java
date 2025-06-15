<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Receipet</title>
</head>
<body>
    <h1>Customer Name: <c:out value="${name}"></c:out></h1>
    <p>item name: <c:out value="${itemName}"></c:out></p>
    <p>price: <c:out value="${price}"></c:out></p>
    <p>description: <c:out value="${description}"></c:out></p>
    <p>vendor: <c:out value="${vendor}"></c:out></p>
</body>
</html>

