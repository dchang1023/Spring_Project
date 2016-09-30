<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Insert title here</title>

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

<header>
	<div class="contatiner-fluid">
		<div id="users">
			<a href="#"><span class="glyphicon glyphicon-user"></span>내정보</a>
			<a href="#"><span class="glyphicon glyphicon-log-in"></span>로그인</a>
		</div>
		<a href="../member/main">Flower</a>
	</div>
</header>


<script>

	//장바구니 보관
	function basketinst(a){
		if(confirm("장바구니에 보관하시겠습니까?")){
			window.location.href="../basket/basketsuccess?item_no="+a+"&buy_vol="+$('#buy_vol option:selected').val();
		}else{
			return false;
		}
	}
	
	//구매페이지로 이동
	function buyitem(a){
		if(confirm("구매 페이지로 이동합니다.")){
			window.location.href="../basket/buy?item_no="+a+"&buy_vol="+$('#buy_vol option:selected').val();
		}
		
	}

</script>
</head>

<body> 
  
<!-- 상품 상세 설명 -->
	<div class="container">
			<p></p><p></p>
			
			<b style="color:white; background-color: black;font-size: 20px;margin-left: 250;font-style:inherit;">${list.item_name }</b><br><br><br>
			<table style="width: 700;height: 350" border="1" >
				<tr>
					<td rowspan="4" width="300" height="250"><img src="${list.img}" width=100% height=100%></td>
					<td style="background-color:red" align="center" valign="middle" width="100"><b style="font-size: 13">상품 번호</b></td>
					<td align="center" valign="middle"><font size='3'>${list.item_no }</font></td>
				</tr>
				<tr>
					<td style="background-color:red" align="center" valign="middle" width="100"><b style="font-size: 13">가격</b></td>
					<td align="center" valign="middle"><font size='3'>${list.price }</font></td>
				</tr>
				<tr>
					<td style="background-color:red" align="center" valign="middle" width="100"><b style="font-size: 13">남은 수량</b></td>
					<td align="center" valign="middle"><font size='3'>${list.volume }</font></td>
				</tr>
				<tr>
					<td style="background-color:red" align="center" valign="middle" width="100"><b style="font-size: 13">상세설명</b></td>
					<td>${list.item_content }</td>
				</tr>
			</table>
	</div>
	
	<div class="first">
		<div class="two" style="margin-left: 150;margin-top: 30">
			<form name="form1">
			
			수량 : <select id="buy_vol" name="buy_vol">
					<option>수량 선택</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
				  </select>&nbsp;&nbsp; | &nbsp;&nbsp;최대 수량 : 10개
				   &nbsp;&nbsp;&nbsp;&nbsp;
			    
			    <!-- 장바구니와 구매 버튼을 클릭한 후, 확인을 누르면 파라미터값으로 item_no(상품번호)와 buy_vol(구매수량)값이 전송 -->
			 	<input type="button" id="bt1" value="장바구니" style="font-size: 15;" onclick="basketinst(${list.item_no});">
			 	&nbsp;&nbsp;&nbsp;&nbsp;
			 	<input type="button" id="bt2" value="구매" style="font-size: 15"; onclick="buyitem(${list.item_no});">
			 	
			</form>
		</div><br><br>
	</div><br><br><br>
  
  
<!-- 리뷰목록 -->
    
    <div id="review" align="center">
	
	<b> REVIEW</b> <hr color="#828282"  width="800">

	<c:if test="${empty review}">
		리뷰가 없습니다. 
	</c:if>
	
		<c:if test="${not empty review}">
		 	<table border="1" >
		 	<c:forEach items="${review}" var="re">
		 		<tr>
		 			<b>작성자</b> ${re.id} | <b>작성일</b> ${re.review_date}<br>
		 			${re.review_tit} <br>
		 			${re.review_con} <br>
		 			사진 <br>
		 			<hr color="#c8c8c8" width="800">
		 		</tr>
		 	</c:forEach>
		 	</table>
	 	</c:if>
 	</div>

</body>
</html>