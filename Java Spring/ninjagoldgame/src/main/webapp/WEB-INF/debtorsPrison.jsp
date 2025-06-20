<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Debtors' Prison</title>
  </head>
  <body>
    <style>
      body {
        font-family: Arial, sans-serif;
        text-align: center;
      }
      .warning {
        font-size: 24px;
        font-weight: bold;
        color: red;
      }
    </style>
    <h1>Debtors' Prison</h1>
    <p class="warning">
      You've fallen too far into debt. Your ninja is imprisoned!
    </p>
    <form action="/reset" method="POST">
      <button type="submit">Start Over</button>
    </form>
  </body>
</html>