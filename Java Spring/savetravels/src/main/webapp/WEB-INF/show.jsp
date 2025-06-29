<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib prefix = "c" uri =
"http://java.sun.com/jsp/jstl/core" %> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %> <%@ taglib prefix="fmt"
uri="http://java.sun.com/jsp/jstl/fmt" %> <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="css/show.css">
    <title>Document</title>
  </head>
  <body>
    <table>
      <tbody>
        <tr>
          <td>Expense Name:</td>
          <td style="padding-left: 24px">
            <c:out value="${expense.name}"></c:out>
          </td>
        </tr>
        <tr>
          <td>Expense Description:</td>
          <td style="padding-left: 24px">
            <c:out value="${expense.description}"></c:out>
          </td>
        </tr>
        <tr>
          <td>Vendor:</td>
          <td style="padding-left: 24px">
            <c:out value="${expense.vendor}"></c:out>
          </td>
        </tr>
        <tr>
          <td>Amount Spent:</td>
          <td style="padding-left: 24px">
            $<fmt:formatNumber
              type="number"
              minFractionDigits="2"
              value="${expense.amount}"
            />
          </td>
        </tr>
      </tbody>
    </table>
  </body>
</html>