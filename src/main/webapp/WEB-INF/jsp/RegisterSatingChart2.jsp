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
    <h1>${ 〇卓お客様情報.卓番号 }卓お会計</h1>
    <table>
      <c:forEach>
        <tr>
          <th>${ 〇卓お客様情報.商品名 }</th>
          <td>${ 〇卓お客様情報.金額 }</td>
          <td>${ 〇卓お客様情報.個数 }</td>
          <td>${ 〇卓お客様情報.注文状態 }</td>
        </tr>
      </c:forEach>
    </table>
    <button type="submit" onclick="popupAction()">座席一覧に戻る</button>
    <p>合計金額:${ 〇卓お客様情報.合計金額 }</p>
    <button type="submit">お会計</button>
    
    <script>
      function popupAction() {
        const result = confirm('お会計をキャンセルしますか?');
        
        if (result) {
            // OK → 遷移したいURLへ移動
            window.location.href = "レジ座席一覧画面"; 
        } 
        else {
            // キャンセル → 何もしない
            return;
        }
      }
    </script>
    
  </body>
</html>