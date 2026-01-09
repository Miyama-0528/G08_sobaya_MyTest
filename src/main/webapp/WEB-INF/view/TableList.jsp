<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>レジ座席一覧画面</title>
  <link rel="stylesheet" href="assets/css/PaymentDone.css">
</head>
<body>

<table class="table">
  <tr>
    <c:forEach var="table" items="${ viewModel.tableList }">
      <td>
        ${ table.tableNumber }卓<br>
        <c:choose>
          <c:when test="${ table.hasCustomer }">
            <button type="button" onclick="location.href='TableBillServlet?tableNumber=${ table.tableNumber }'">
              お会計
            </button>
          </c:when>
          <c:otherwise>
            <div>案内可</div>
          </c:otherwise>
        </c:choose>
      </td>

      <c:if test="${ table.tableNumber % 4 == 0 }">
        </tr><tr>
      </c:if>

    </c:forEach>
  </tr>
</table>

</body>
</html>
