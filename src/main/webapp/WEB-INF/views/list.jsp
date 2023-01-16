<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<h2>list.jsp</h2>
	<table class="table table-striped table-hover">
	
		<tr>
			<th>날짜</th>
			<th>이름</th>
			<th>정당명</th>
		</tr>
		<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.date}</td>
			<td>${dto.name}</td>
			<td>${dto.party}</td>
		</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>