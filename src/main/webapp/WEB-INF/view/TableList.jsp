<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>レジ座席一覧画面</title>
    <link rel="stylesheet"
      href="${pageContext.request.contextPath}/assets/css/TableList.css">
  </head>
  
  <body>
    <span id="datetime"></span>
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

  <script>
    // 時間表示設定(jsp出力ver)
    function updateDateTime() {
      const now = new Date();
      
      const yyyy = now.getFullYear();
      const mm   = String(now.getMonth() + 1).padStart(2, '0');
      const dd   = String(now.getDate()).padStart(2, '0');
      
      const week = ["日", "月", "火", "水", "木", "金", "土"];
      const w    = week[now.getDay()];
      
      const hh   = String(now.getHours()).padStart(2, '0');
      const mi   = String(now.getMinutes()).padStart(2, '0');
      const ss   = String(now.getSeconds()).padStart(2, '0');
      
      document.getElementById("datetime").textContent =
        yyyy + "/" + mm + "/" + dd + " (" + w + ") " + hh + ":" + mi + ":" + ss;
     }

     updateDateTime();               // 初回表示
     setInterval(updateDateTime, 1000); // 1秒ごと更新
  </script>

</html>
