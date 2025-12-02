<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>レジ座席一覧画面</title>
    <!-------仮css------->
    <style>
      table {
          border: 3px solid;
          border-color: black;
          width: 100%;
      }

      td {
          border: 3px solid;
          border-color: black;
          padding: 30pt;
      }

      div {
          color: #789;
          text-align: center;
      }
    </style>
  </head>

  <body>
    <table>
      <tr>
        <td>1卓<br>
          <c:choose>
            <c:when test="${ not empty 1卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>2卓<br>
          <c:choose>
            <c:when test="${ not empty 2卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>3卓<br>
          <c:choose>
            <c:when test="${ not empty 3卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>4卓<br>
          <c:choose>
            <c:when test="${ not empty 4卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
      </tr>
      <tr>
        <td>5卓<br>
          <c:choose>
            <c:when test="${ not empty 5卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>6卓<br>
          <c:choose>
            <c:when test="${ not empty 6卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>7卓<br>
          <c:choose>
            <c:when test="${ not empty 7卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>8卓<br>
          <c:choose>
            <c:when test="${ not empty 8卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
      </tr>
      <tr>
        <td>9卓<br>
          <c:choose>
            <c:when test="${ not empty 9卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>10卓<br>
          <c:choose>
            <c:when test="${ not empty 10卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>11卓<br>
          <c:choose>
            <c:when test="${ not empty 11卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>12卓<br>
          <c:choose>
            <c:when test="${ not empty 12卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
      </tr>
      <tr>
        <td>13卓<br>
          <c:choose>
            <c:when test="${ not empty 13卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>14卓<br>
          <c:choose>
            <c:when test="${ not empty 14卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>15卓<br>
          <c:choose>
            <c:when test="${ not empty 15卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
        <td>16卓<br>
          <c:choose>
            <c:when test="${ not empty 16卓お客様情報 }">
              <button type="submit" onclick="レジ会計画面">お会計</button>
            </c:when>
            <c:otherwise>
              <div>案内可</div>
            </c:otherwise>
          </c:choose>
        </td>
      </tr>
    </table>
  </body>
</html>