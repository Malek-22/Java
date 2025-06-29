<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%> <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> <%@
taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <h1><c:out value="${dojo.name}" /></h1>
    <ul>
      <c:forEach var="ninja" items="${dojo.ninjas}">
        <li>
          <c:out value="${ninja.firstName}" />
          <c:out value="${ninja.lastName}" />
        </li>
      </c:forEach>
    </ul>
    <div style="display: flex; justify-content: space-between">
      <a href="/dojos/new">Add Dojo</a>
      <a href="/ninjas/new">Add Ninja</a>
    </div>
  </body>
</html>