<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>은지의 게시판</title>
  </head>
  <body>
    <jsp:include page="/Header.jsp" />

    <h1 style="color: coral; text-align: justify">게시글 목록</h1>
    <table border="1">
      <td colspan="6" align="left" style="color: coral">
        1-${ paging.pageSize }[${ paging.currentPage}]/${paging.totalRow}
      </td>
      <tr style="color: coral">
        <th>아이디</th>
        <th>제목</th>
        <th>시작일</th>
        <th>종료일</th>
        <th>상태</th>
        <th>삭제</th>
      </tr>
      <!-- 출력 될 게시판 -->
      <c:forEach var="board" items="${ newList }">
        <tr style="color: coral">
          <td>${ board.abc }</td>
          <td>${ board.bdTitle }</td>
          <td>${ board.bdCdate }</td>
          <td>${ board.bdCdate }</td>
          <td>${ board.bdViews }</td>
          <td><a href="IndexController?del=${board.bdID}">[삭제]</a></td>
        </tr>
      </c:forEach>
      <!-- 페이지 링크 -->
      <tr>
        <td colspan="5" align="center">
          <c:if test="${paging.startPage > paging.pageBlock}">
            <a href="indexController?no=${paging.startPage - 10}"> [이전] </a>
          </c:if>
          <c:forEach
            var="num"
            begin="${ paging.startPage }"
            end="${ paging.endPage }"
          >
            <c:if test="${ num <= paging.totalRow }">
              <a href="indexController?no=${ num }"> [${ num }]</a>
            </c:if>
          </c:forEach>
          <c:if test="${paging.endPage < paging.totalRow}">
            <a href="indexController?no=${paging.startPage + 10}"> [다음] </a>
          </c:if>
        </td>
      </tr>
    </table>
  </body>
</html>
