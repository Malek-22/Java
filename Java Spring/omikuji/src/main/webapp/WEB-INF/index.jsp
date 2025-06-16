<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="css/Style.css" />
    <title>Omikuji Fortune</title>
  </head>
  <body>
    <h1>Omikuji Fortune</h1>
    <form action="/omikuji/process" method="post">
      <p>
        <label for="number">Pick any number from 5 to 25:</label>
        <input
          type="number"
          name="number"
          id="number"
          min="5"
          max="25"
          required
        />
      </p>
      <p>
        <label for="city">Enter the name of any city:</label>
        <input type="text" name="city" id="city" required />
      </p>
      <p>
        <label for="person">Enter the name of any real person:</label>
        <input type="text" name="person" id="person" required />
      </p>
      <p>
        <label for="hobby">Enter professional endeavor or hobby:</label>
        <input type="text" name="hobby" id="hobby" required />
      </p>
      <p>
        <label for="livingThing">Enter any type of living thing:</label>
        <input type="text" name="livingThing" id="livingThing" required />
      </p>
      <p>
        <label for="niceMessage">Say something nice to someone:</label>
        <input type="text" name="niceMessage" id="niceMessage" required />
      </p>
      <button type="submit">Send</button>
    </form>
  </body>
</html>