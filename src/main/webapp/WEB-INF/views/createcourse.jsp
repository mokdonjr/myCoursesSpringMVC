<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 사용자 request에 대한 validation을 수행하고 BindingResult와 Data-Binding했던 입력한 값을 출력하려면
Data-Buffering을 위해 html이 아닌 spring from tag를 이용해야한다. -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
<title>Insert title here</title>
</head>
<body>

	<a href="${pageContext.request.contextPath}/">홈페이지로 돌아가기</a>

	<sf:form method="get" action="${pageContext.request.contextPath}/docreate"
	modelAttribute="course">
		<table class="formtable">
			<tr>
				<td class="lable">수강년도 :</td>
				<td><sf:input class="control" path="year" type="text" /><br>
					<sf:errors cssClass="error" path="year"></sf:errors></td>
			</tr>
			<tr>
				<td class="lable">수강학기 :</td>
				<td><sf:input class="control" path="semester" type="text" /><br>
					<sf:errors cssClass="error" path="semester"></sf:errors></td>
			</tr>
			<tr>
				<td class="lable">교과목 코드 :</td>
				<td><sf:input class="control" path="code" type="text" /><br>
					<sf:errors cssClass="error" path="code"></sf:errors></td>
			</tr>
			<tr>
				<td class="lable">교과목명 :</td>
				<td><sf:input class="control" path="name" type="text" /><br>
					<sf:errors cssClass="error" path="name"></sf:errors></td>
			</tr>
			<tr>
				<td class="lable">이수구분 :</td>
				<td><sf:input class="control" path="type" type="text" /><br>
					<sf:errors cssClass="error" path="type"></sf:errors></td>
			</tr>
			<tr>
				<td class="lable">학점 :</td>
				<td><sf:input class="control" path="credit" type="text"/><br>
					<sf:errors cssClass="error" path="credit"></sf:errors></td>
			</tr>
			<tr>
				<td class="lable"></td>
				<td><input class="control" type="submit" value="Create Course"/></td>
			</tr>

		</table>
	</sf:form>

</body>
</html>