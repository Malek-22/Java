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
    <h1>New Ninja</h1>
    <form:form action="/ninjas" method="post" modelAttribute="ninja">
      <p>
        <form:label path="firstName">First Name:</form:label>
        <form:input path="firstName" />
      </p>

      <p>
        <form:label path="lastName">Last Name:</form:label>
        <form:input path="lastName" />
      </p>
      <p>
        <form:label path="age">Age:</form:label>
        <form:input path="age" />
      </p>

      <p>
        <form:label path="dojo">Dojo:</form:label>

        <form:select path="dojo">
          <c:forEach var="eachDojo" items="${dojos}">
            <option value="${eachDojo.id}">
              <c:out value="${eachDojo.name}" />
            </option>
          </c:forEach>
        </form:select>
      </p>

      <input type="submit" value="Submit" />
    </form:form>
  </body>
</html>