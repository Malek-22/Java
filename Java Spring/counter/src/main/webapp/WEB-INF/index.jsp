<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Session Counter</title>
  </head>
  <body>
    <h1>Your Current Counter : ${counter}</h1>
    <p>
      <a href="/"> Increment by 1</a><br />
      <a href="/plusTwo">Increment by 2</a>
    </p>
    <form action="/reset" method="post">
      <button>Reset Counter</button>
    </form>
  </body>
</html>