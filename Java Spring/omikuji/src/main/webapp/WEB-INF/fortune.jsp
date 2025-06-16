<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="CSS/FortuneStyle.css" />
    <title>Your Omikuji Fortune</title>
  </head>
  <body>
    <h1>Your Omikuji Fortune</h1>
    <p>
      In <span>${number}</span> years, you will live in
      <span>${city}</span> with <span>${person}</span> as your roommate,
      engaging in <span>${hobby}</span>. The next time you see a
      <span>${livingThing}</span> it will bring you good luck. And remember:
      <span>${niceMessage}</span>
    </p>
    <a href="/omikuji">Go back to the form</a>
  </body>
</html>