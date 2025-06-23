<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Reading Books</title>
  </head>
  <body>
    <h1><c:out value="${book.title}" /></h1>
    <p>Description: <c:out value="${book.description}" /></p>
    <p>Language: <c:out value="${book.language}" /></p>
    <p>Number of Pages: <c:out value="${book.numberOfPages}" /></p>
  </body>
</html>