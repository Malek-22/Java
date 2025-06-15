<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>Fruit Store</title>
  </head>
  <body>
    <h1>Fruit Store</h1>
    <c:forEach var="item" items="${fruits}">
      <div class="fruit ${fn:startsWith(item.name, 'G') ? 'orange' : ''}">
        <span>${item.name}</span>
        <span>$<c:out value="${item.price}" /></span>
      </div>
    </c:forEach>
  </body>
</html>