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
    <link rel="stylesheet" type="text/css" href="css/index.css" />
    <title>Document</title>
  </head>
  <body>
    <div class="table">
      <h1>Save Travels</h1>
      <table class="table table-striped table-bordered">
        <thead>
          <tr>
            <th class="text-center">Expense</th>
            <th class="text-center">Vendor</th>
            <th class="text-center">Amount</th>
            <th class="text-center">Actions</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="expense" items="${expenses}">
            <tr>
              <td class="text-center">
                <a href='/expenses/<c:out value="${expense.id}"></c:out>'
                  ><c:out value="${expense.name}"></c:out
                ></a>
              </td>
              <td class="text-center">
                <c:out value="${expense.vendor}"></c:out>
              </td>
              <td class="text-center">
                $<fmt:formatNumber
                  type="number"
                  minFractionDigits="2"
                  value="${expense.amount}"
                />
              </td>
              <td class="text-center">
                <a href="/expenses/edit/${expense.id}">edit</a>
                <a href="/expenses/delete/${expense.id}">delete</a>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>

      <div></div>
      <div class="form">
        <h1>Add an expense:</h1>
        <form:form action="/expenses" method="post" modelAttribute="expense">
          <div>
            <form:label path="name">Expense Name: </form:label><br />
            <form:errors path="name" class="text-danger" />
            <form:input style="width: 250px" path="name" />
          </div>

          <div>
            <form:label path="vendor">Vendor: </form:label><br />
            <form:errors path="vendor" class="text-danger" />
            <form:input style="width: 250px" path="vendor" />
          </div>

          <div>
            <form:label path="amount">Amount: </form:label><br />
            <form:errors path="amount" class="text-danger" />
            <form:input
              style="width: 250px"
              type="number"
              step="0.01"
              min="0"
              path="amount"
            />
          </div>

          <div>
            <form:label path="description">Description: </form:label><br />
            <form:errors path="description" class="text-danger" />
            <form:textarea style="width: 250px" rows="3" path="description" />
          </div>

          <div>
            <input type="submit" value="Submit" />
          </div>
        </form:form>
      </div>
    </div>
  </body>
</html>