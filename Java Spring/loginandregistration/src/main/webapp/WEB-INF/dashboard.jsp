<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib prefix = "c" uri =
"http://java.sun.com/jsp/jstl/core" %> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %> <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="CSS/dashboard.css" />
    <title>Welcome to dashBored</title>
  </head>
  <body>
    <h1>Welcome, <c:out value="${user.userName}" />!</h1>
    <p>This is your dashboard. Nothing to see here yet.</p>
    <p><a href="/logout">logout</a></p>
  </body>
</html>