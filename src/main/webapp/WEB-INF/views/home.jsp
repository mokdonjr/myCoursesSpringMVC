<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
<title>1191065 백승찬 수강신청조회 홈페이지 입니다</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>
	<div class="jumbotron text-center">
		<h1>즐거운 수강신청</h1>
		<p>1191065 백승찬 웹 프레임워크 과제입니다</p>
		<p>
			<h5><a href="/firstMVC/home?action=login">로그인</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="/firstMVC/home?action=register">회원 가입</a><br><br>
			<a href="/firstMVC/home?action=forgot">내 계정 찾기</a></h5><br>
			<h6><a href="/firstMVC/home?action=showCustomers">가입자 현황 보기</a></h6>
		</p>
			<h4>새로운 수강신청 기회가 있습니다!</h4>
			<form class="form-signin" action="${pageContext.request.contextPath}/createcourse" method="post">
				<button class="btn btn-lg btn-primary " type="submit" value="로그인">수강신청하기</button>
			</form>
		
		<p>
			
		</p>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<h3>전공기초</h3>
				<p>지금까지 수강한 전공기초 과목을 확인하세요<a href="${pageContext.request.contextPath}/courses_jungi"> 확인 </a></p>
				<p>more</a></p>
			</div>
			<div class="col-sm-4">
				<h3>전공선택</h3>
				<p>지금까지 수강한 전공선택 과목을 확인하세요<a href="${pageContext.request.contextPath}/courses_junsun"> 확인 </a></p>
				<p>more</a></p>
			</div>
			<div class="col-sm-4">
				<h3>전공지정</h3>
				<p>지금까지 수강한 전공지정 과목을 확인하세요<a href="${pageContext.request.contextPath}/courses_junji"> 확인 </a></p>
				<p>more</a></p>
			</div>
			<div class="col-sm-4">
				<h3>한성인재교양</h3>
				<p>지금까지 수강한 한성인재교양 과목을 확인하세요<a href="${pageContext.request.contextPath}/courses_hakgyoB"> 확인 </a></p>
				<p>한성인재교양은 구 핵심교양B 과목입니다.</a></p>
			</div>
			<div class="col-sm-4">
				<h3>토대교양</h3>
				<p>지금까지 수강한 토대교양 과목을 확인하세요<a href="${pageContext.request.contextPath}/courses_hakgyoA"> 확인 </a></p>
				<p>토대교양은 구 핵심교양A 과목입니다.</a></p>
			</div>
			<div class="col-sm-4">
				<h3>일반교양</h3>
				<p>지금까지 수강한 한성인재교양 과목을 확인하세요<a href="${pageContext.request.contextPath}/courses_ilgyo"> 확인 </a></p>
				<p>more</a></p>
			</div>
		</div>
	</div>
	

	<!-- ContextRoot가 주입된다 /helloSpringMVC -->
	<p>
		
	<p>
		<a href="${pageContext.request.contextPath}/createcourse"> Add a
			new course </a> <br>
		<!-- 12월3일 이수구분별 show current courses -->
	<p>
		
	<p>
		
	<p>
		
	<p>
		
	<p>
	<p>
		 <br>
		<!-- 12월3일 수강신청하기 (위에것은 단순 추가) -->
	<p>
		<a href="${pageContext.request.contextPath}/c"> 수강신청하기 </a>
	<p>
		<a href="${pageContext.request.contextPath}/c"> 수강신청조회 </a>
</body>
</html>
