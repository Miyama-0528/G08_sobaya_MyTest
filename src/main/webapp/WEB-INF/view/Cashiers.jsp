<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
  <head>
    <title>会計画面</title>

    <style>
      table {
        border-collapse: collapse; width: 100%;
      }
      
      th, td {
        border: 1px solid #000; padding: 8px; text-align: center;
      }
      
      div {
        margin-top: 10px;
      }
    </style>
  </head>

  <body>
    <span id="datetime"></span>
    <h2>テーブル ${viewModel.tableNumber} の会計</h2>

    <!-- 注文一覧 -->
    <table>
      <tr>
        <th>商品名</th>
        <th>数量</th>
        <th>単価</th>
        <th>小計</th>
        <th>状態</th>
      </tr>

      <c:forEach var="item" items="${viewModel.orderList}">
        <tr>
          <td>${ item.orderName }</td>
          <td>${ item.stock }</td>
          <td>${ item.price }</td>
          <td>${ item.stock * item.price }</td>
          <td>${ item.orderStatus }</td>
        </tr>
      </c:forEach>
    </table>

    <!-- お会計中止時確認 -->
    <button type="button" onclick="cancelPayment()">お会計を中止する</button>
    
    <!-- テンキー -->
    <div>
      <div>
        <button type="button" onclick="addNumber(7)">7</button>
        <button type="button" onclick="addNumber(8)">8</button>
        <button type="button" onclick="addNumber(9)">9</button>
      </div>
      <div>
        <button type="button" onclick="addNumber(4)">4</button>
        <button type="button" onclick="addNumber(5)">5</button>
        <button type="button" onclick="addNumber(6)">6</button>
      </div>
      <div>
        <button type="button" onclick="addNumber(1)">1</button>
        <button type="button" onclick="addNumber(2)">2</button>
        <button type="button" onclick="addNumber(3)">3</button>
      </div>
      <div>
        <button type="button" onclick="addNumber(0)">0</button>
        <button type="button" onclick="clearPay()">C</button>
      </div>
    </div>
    
    <!-- 合計金額 -->
    <h3>合計金額：<span id="total">${ viewModel.totalPrice }</span> 円</h3>

    <!-- 支払金額入力＋お釣り -->
    <div>
      <label>支払金額：</label>
      <input type="number" id="pay" oninput="calcChange()">
    </div>

    <!-- 会計ボタン -->
    <button type="button" onclick="confirmPayment()">会計</button>
    
    <!-- 会計結果表示エリア（初期は非表示） -->
    <div id="resultArea" style="display:none; margin-top:20px;">
      <h3>お釣り：<span id="finalChange">0</span> 円</h3>

      <button type="button" onclick="location.href='TableListServlet'">
        座席一覧へ戻る
      </button>
    </div>
    
    <script>
      // お会計中止時確認ポップアップ 
      function cancelPayment() { 
        const result = confirm("お会計を中止して座席一覧に戻りますか？");
        if (result) { 
          location.href = "TableListServlet"; 
        }
      }
    
      let isPaid = false;

      function confirmPayment() {
        if (isPaid) return;

        const total = Number(document.getElementById("total").textContent);
        const pay   = Number(document.getElementById("pay").value);

        if (pay < total) {
          alert("支払い金額が不足しています。");
          return;
        }

        const ok = confirm("この金額で会計しますか？");
        if (!ok) return;

        const change = pay - total;

        // 表示更新
        document.getElementById("finalChange").textContent = change;
        document.getElementById("resultArea").style.display = "block";

        // 二重会計防止
        isPaid = true;
      }

      // テンキー
      function addNumber(num) {
        if (isPaid) return;
        const pay = document.getElementById("pay");
        pay.value = pay.value + num;
      }

      function clearPay() {
        if (isPaid) return;
        document.getElementById("pay").value = "";
      }

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

       updateDateTime();                  // 初回表示
       setInterval(updateDateTime, 1000); // 1秒ごと更新
    </script>
  </body>
</html>
