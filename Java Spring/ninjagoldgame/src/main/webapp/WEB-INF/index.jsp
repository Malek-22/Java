<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="CSS/Style.css" />
    <title>Ninja Gold Game</title>
  </head>
  <body>
    <h1>Ninja Gold Game</h1>
    <p class="gold-count">Gold: ${sessionScope.gold}</p>

    <form action="/process" method="POST">
      <input type="hidden" name="location" value="farm" />
      <button type="submit">Enter Farm (+10-20 Gold)</button>
    </form>

    <form action="/process" method="POST">
      <input type="hidden" name="location" value="cave" />
      <button type="submit">Enter Cave (+5-10 Gold)</button>
    </form>

    <form action="/process" method="POST">
      <input type="hidden" name="location" value="house" />
      <button type="submit">Enter House (+2-5 Gold)</button>
    </form>

    <form action="/process" method="POST">
      <input type="hidden" name="location" value="quest" />
      <button type="submit">Go on a Quest (±0-50 Gold)</button>
    </form>

    <form action="/process" method="POST">
      <input type="hidden" name="location" value="spa" />
      <button type="submit">Visit the Spa (-5-20 Gold)</button>
    </form>

    <form action="/reset" method="POST">
      <button type="submit">Reset Game</button>
    </form>

    <h3>Activity Log</h3>
    <div class="activities">
      <c:forEach var="activity" items="${sessionScope.activities}">
        <p>${activity}</p>
      </c:forEach>
    </div>
  </body>
</html>