<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>レジ会計画面</title>
    <!-------仮css------->
    <style>
      table {
        border: 3px solid;
        border-color: black;
        width: 100%;
      }

      th {
        text-align: center;
        border: 3px solid;
        border-color: black;
        padding: 20px;
        padding-left: 70px;
        padding-right: 70px;
      }

      td {
        text-align: center;
        border: 3px solid;
        border-color: black;
        padding: 20px;
      }
    </style>
  </head>

  <body>
    <h1>${ viewModel.tableInfo.tableNumber }卓お会計</h1>
    <table>
      <c:forEach var="item" items="${ viewModel.orderList }">
        <tr>
          <th>${ item.orderName }</th>
          <td>${ item.price }</td>
          <td>${ item.stock }</td>
          <td>${ item.orderStatus }</td>
        </tr>
      </c:forEach>
    </table>
    <button onclick="popupAction()">座席一覧に戻る</button>
    <p>合計金額:${ viewModel.totalPrice }</p>
    <button type="submit">お会計</button>
    
    <script>
      function popupAction() {
        const result = confirm('お会計をキャンセルしますか?');
        
        if (result) {
            // OK → 遷移したいURLへ移動
            window.location.href = "/WEB-INF/jsp/Table.jsp"; 
        } 
        else {
            // キャンセル → 何もしない
            return;
        }
      }
    </script>
    
  </body>
</html>