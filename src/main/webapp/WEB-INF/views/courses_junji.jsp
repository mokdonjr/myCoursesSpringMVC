<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
</head>
<body>
	<div class="container">
		<h2>전공지정</h2>
		<p>지금까지 수강한 전공지정과목을 확인하세요</p>
		<p>
			<a href="${pageContext.request.contextPath}/">모두 확인 했으며 홈페이지로
				돌아가기</a>
		</p>
		<table class="table">
			<thead>
				<tr>
					<th>수강년도</th>
					<th>수강학기</th>
					<th>교과목코드</th>
					<th>교과목명</th>
					<th>이수구분</th>
					<th>학점</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="course" items="${courses}">
					<tr>
						<td><c:out value="${course.name}"></c:out></td>
						<td><c:out value="${course.year}"></c:out></td>
						<td><c:out value="${course.code}"></c:out></td>
						<td><c:out value="${course.name}"></c:out></td>
						<td><c:out value="${course.type}"></c:out></td>
						<td><c:out value="${course.credit}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>