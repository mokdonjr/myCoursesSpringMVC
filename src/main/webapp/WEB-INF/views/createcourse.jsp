<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 사용자 request에 대한 validation을 수행하고 BindingResult와 Data-Binding했던 입력한 값을 출력하려면
Data-Buffering을 위해 html이 아닌 spring from tag를 이용해야한다. -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"> -->
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
	
		<a href="${pageContext.request.contextPath}/">홈페이지로 돌아가기</a>

		<sf:form class="form-signin" method="get" action="${pageContext.request.contextPath}/docreate" modelAttribute="course">
			
			<center>
			<table>
			<tr>
				<td><label for="year">수강년도</label> </td>
				<td><sf:input class="form-control" path="year" type="text" placeholder="ex)2017" /><br>
					<sf:errors cssClass="error" path="year"></sf:errors></td>
			</tr>
			<tr>
				<td><label for="semester">수강학기</label> </td>
				<td><sf:input class="form-control" path="semester" type="text" id="semester" placeholder="ex)1 또는 2" /><br>
					<sf:errors cssClass="error" path="semester"></sf:errors></td>
			</tr>
			<tr>
				<td><label for="code">교과목코드</label> </td>
				<td><sf:input class="form-control" path="code" type="text" id="code" placeholder="ex)CSE0001" /><br>
					<sf:errors cssClass="error" path="code"></sf:errors></td>
			</tr>
			<tr>
				<td><label for="name">교과목명</label> </td>
				<td><sf:input class="form-control" path="name" type="text" id="name" placeholder="ex)웹프레임워크2" /><br>
					<sf:errors cssClass="error" path="name"></sf:errors></td>
			</tr>
			<tr>
				<td><label for="type">이수구분</label> </td>
				<td><sf:input class="form-control" path="type" type="text" id="type" placeholder="ex)전선" /><br>
					<sf:errors cssClass="error" path="type"></sf:errors></td>
			</tr>
			<tr>
				<td><label for="credit">학점</label> </td>
				<td><sf:input class="form-control" path="credit" type="text" id="credit" placeholder="ex)3" /><br>
					<sf:errors cssClass="error" path="credit"></sf:errors></td>
			</tr>
			<tr>
				<td class="lable"></td>
				<!-- <td><input class="control" type="submit" value="Create Course"/></td> -->
				<td> <button class="btn btn-lg btn-primary " type="submit" value="Create Course">Create Course</button> <td>
			</tr>

		</table>
		</center>
		</sf:form>

	</div>


</body>
</html>