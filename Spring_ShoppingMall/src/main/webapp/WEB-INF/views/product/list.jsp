<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Flower</title>
<style>
<%-- header --%> 
	a{text-decoration:none;}
	a:hover{text-decoration:none;}
	a:active{text-decoration: none}
	
	header>div>a{
		font-size:40px; 
		color:#000000;
		text-shadow:2px 2px #000000;
		margin-left:10px;  
	} 
	header>div>a:hover{
		text-decoration:none; 
	} 
	
	#users{
		float:right;
	}
	#users>a{
		color:#000000;
	}
	#users>a:hover{
		text-decoration:none; 
	}
</style>

</head>
<body>

<!--header -->
	<header>
		<div class="contatiner-fluid">
			<div id="users">
				<a href="#"><span class="glyphicon glyphicon-user"></span>내정보</a>
				<a href="#"><span class="glyphicon glyphicon-log-in"></span>로그인</a>
			</div>
			<a href="main">Flower</a>
		</div>
	</header>
<!-- board -->
	<div class="container">
		<div class="row">
			<div class="col-lg-4">
				<p></p>
				<b style="font-size:24"> 상품 게시판 </b>
				<p></p>
				<table style="width:100%;" border="1" class="text-center">
				<tr style="background-color:ff5555">
					<td>상품번호</td>
					<td>상품이름</td>
					<td>카테고리</td>
					<td>가격</td>
					<td>볼륨</td>
					<td>이미지</td>
					<td>등록일자</td>
					<td>상품내용</td>
				<tr>
					<c:forEach items="${list}" var="pdt">
						<tr>
							<td><a href=../product/detail?item_no=${pdt.item_no}>${pdt.item_no}</a></td>
							<td>${pdt.item_name}</td>
							<td>${pdt.category}</td>
							<td>${pdt.price}</td>
							<td>${pdt.volume}</td>
							<td><a href=/detail?category=${pdt.category}&item_no=${pdt.item_no}>${pdt.img}</a></td>
							<td>${pdt.reg_date}</td>
							<td>${pdt.item_content}</td>
						<tr>
					</c:forEach>
				</table>
				<p></p>
			</div>
		</div>
	</div>	
<input type="button" class="btn back" value="돌아가기"/>
<!-- <input type="button" class="btn " value=""/> -->

<script>
		$(document).ready(function(){
			$(".back").on("click", function(){
				window.location.href="../member/main";
			});
		});
</script>
</body>
</html>